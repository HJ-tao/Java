package edu.whut.cs.jee.mooc.upms.controller;

import edu.whut.cs.jee.mooc.common.constant.AppConstants;
import edu.whut.cs.jee.mooc.common.util.BeanConvertUtils;
import edu.whut.cs.jee.mooc.upms.dto.AdminDto;
import edu.whut.cs.jee.mooc.upms.dto.StudentDto;
import edu.whut.cs.jee.mooc.upms.dto.TeacherDto;
import edu.whut.cs.jee.mooc.upms.dto.UserDto;
import edu.whut.cs.jee.mooc.upms.model.Role;
import edu.whut.cs.jee.mooc.upms.model.User;
import edu.whut.cs.jee.mooc.upms.security.JwtAuthenticationRequest;
import edu.whut.cs.jee.mooc.upms.service.AuthService;
import edu.whut.cs.jee.mooc.upms.service.UserService;
import edu.whut.cs.jee.mooc.upms.vo.UserSignUpVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@RestController
@Api(tags={"授权管理"})
public class AuthController {
    @Value("${jwt.header}")
    private String tokenHeader;

    @Autowired
    private AuthService authService;

    @Autowired
    private UserService userService;

    @ApiOperation(value = "用户登录",notes = "用户使用用户名密码换取token")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "authenticationRequest", value = "JWT授权请求信息", dataType = "JwtAuthenticationRequest")
    })
    @RequestMapping(value = "${jwt.route.authentication.path}", method = RequestMethod.POST)
    public String createAuthenticationToken(
            @RequestBody @Valid JwtAuthenticationRequest authenticationRequest) throws AuthenticationException {
        final String token = authService.login(authenticationRequest.getUsername(), authenticationRequest.getPassword());
        // Return the token
        return token;
    }

    @ApiOperation(value = "刷新token",notes = "旧token换取新token，延长有效期")
    @RequestMapping(value = "${jwt.route.authentication.refresh}", method = RequestMethod.GET)
    public String refreshAndGetAuthenticationToken(
            HttpServletRequest request) throws AuthenticationException{
        String token = request.getHeader(tokenHeader);
        String refreshedToken = authService.refresh(token);
        return refreshedToken;
    }

  /*  @ApiOperation(value = "用户注册",notes = "学生注册接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "studentDto", value = "用户注册信息", dataType = "StudentDto")
    })
    @RequestMapping(value = "${jwt.route.authentication.register}", method = RequestMethod.POST)
    public User register(@RequestBody @Valid StudentDto studentDto) throws AuthenticationException{
        return authService.register(studentDto);
    }*/

    @ApiOperation(value = "用户注册",notes = "用户注册接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userSignUpVo", value = "用户注册信息", dataType = "UserSignUpVo")
    })
    @RequestMapping(value = "${jwt.route.authentication.register}", method = RequestMethod.POST)
    public User register(@RequestBody @Valid UserSignUpVo userSignUpVo) throws AuthenticationException{
        UserDto userDto = null;
        Role role = null;
        if (userSignUpVo.getRole() == AppConstants.ROLE_TEACHER_ID) {
            userDto = BeanConvertUtils.convertTo(userSignUpVo, TeacherDto::new);
            role = new Role(AppConstants.ROLE_TEACHER_ID);
        } else if (userSignUpVo.getRole() == AppConstants.ROLE_STUDENT_ID) {
            userDto = BeanConvertUtils.convertTo(userSignUpVo, StudentDto::new);
            role = new Role(AppConstants.ROLE_STUDENT_ID);
        }else if (userSignUpVo.getRole() == AppConstants.ROLE_ADMIN_ID) {
            userDto = BeanConvertUtils.convertTo(userSignUpVo, AdminDto::new);
            role = new Role(AppConstants.ROLE_ADMIN_ID);
        }
        userDto.addRole(role);
        return authService.register(userDto);
    }


}
