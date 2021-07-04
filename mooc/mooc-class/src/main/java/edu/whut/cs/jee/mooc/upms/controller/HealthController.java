package edu.whut.cs.jee.mooc.upms.controller;

import edu.whut.cs.jee.mooc.common.base.ResultVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

@ApiIgnore()
@RestController
public class HealthController {

    @GetMapping("/health")
    public ResultVo health() {
        return new ResultVo("访问在线版文档更方便http://{{host}}:{{port}}/doc.html");
    }
}
