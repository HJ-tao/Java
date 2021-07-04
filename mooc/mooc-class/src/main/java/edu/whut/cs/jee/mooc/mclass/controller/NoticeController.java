package edu.whut.cs.jee.mooc.mclass.controller;

import edu.whut.cs.jee.mooc.mclass.dto.NoticeDto;
import edu.whut.cs.jee.mooc.mclass.service.NoticeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author wadao
 * @version 1.0
 * @date 2020/6/11 17:18
 * @site niter.cn
 */
@Slf4j
@RestController
@Api(tags={"公告管理"})
@RequestMapping("/notice")
public class NoticeController {
    @Autowired
    private NoticeService noticeService;

    @GetMapping("")
    @ApiOperation(value = "获取公告", notes = "根据课程ID获取公告")
    public List<NoticeDto> getNotices(@RequestParam(value = "courseId", required = true) Long courseId) {
        return  noticeService.getNotices(courseId);
    }

    @PreAuthorize("hasAnyRole('TEACHER','ADMIN')")
    @PostMapping("")
    @ApiOperation(value = "新增公告")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "noticeDto", value = "公告基本信息", dataType = "NoticeDto")
    })
    public NoticeDto save(@RequestBody @Valid NoticeDto noticeDto) {
        return noticeService.saveNotice(noticeDto);
    }

    @PreAuthorize("hasAnyRole('TEACHER','ADMIN')")
    @DeleteMapping("{id}")
    @ApiOperation(value = "删除公告", notes = "根据公告ID删除公告")
    @ApiImplicitParam(name = "id", value = "公告ID", required = true, paramType = "path")
    public String delete(@PathVariable Long id) {
        noticeService.removeNotice(id);
        return "success";
    }

    @PreAuthorize("hasAnyRole('TEACHER','ADMIN')")
    @PutMapping("")
    @ApiOperation(value = "编辑公告", notes = "根据公告ID更新公告")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "noticeDto", value = "公告基本信息", dataType = "NoticeDto")
    })
    public NoticeDto update(@RequestBody @Valid NoticeDto noticeDto) {

        return noticeService.updateNotice(noticeDto);
    }
}
