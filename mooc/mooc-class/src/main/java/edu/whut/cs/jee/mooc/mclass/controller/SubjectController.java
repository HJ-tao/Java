package edu.whut.cs.jee.mooc.mclass.controller;

import edu.whut.cs.jee.mooc.common.util.BeanConvertUtils;
import edu.whut.cs.jee.mooc.mclass.dto.ChoiceDto;
import edu.whut.cs.jee.mooc.mclass.dto.FillDto;
import edu.whut.cs.jee.mooc.mclass.dto.JudgmentDto;
import edu.whut.cs.jee.mooc.mclass.dto.OptionDto;
import edu.whut.cs.jee.mooc.mclass.model.Subject;
import edu.whut.cs.jee.mooc.mclass.service.SubjectService;
import edu.whut.cs.jee.mooc.mclass.vo.ChoiceSaveVo;
import edu.whut.cs.jee.mooc.mclass.vo.FillSaveVo;
import edu.whut.cs.jee.mooc.mclass.vo.JudgmentSaveVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;
import java.util.List;

@Slf4j
@RestController
@Api(tags={"习题管理"})
@RequestMapping("/subject")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

   /* @PostMapping("saveJudgment")
    @ApiOperation(value = "新增/保存判断题")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "judgment", value = "判断题信息", dataType = "Judgment")
    })
    public Subject saveJudgment(@RequestBody @Valid Judgment judgment) {
        return subjectService.saveSubject(judgment);
    }
*/
   @PostMapping("saveJudgment")
   @ApiOperation(value = "新增/保存判断题")
   @ApiImplicitParams({
           @ApiImplicitParam(name = "judgmentSaveVo", value = "判断题信息", dataType = "JudgmentSaveVo")
   })
   public Long saveJudgment(@RequestBody @Valid JudgmentSaveVo judgmentSaveVo) {
       return subjectService.saveJudgment(BeanConvertUtils.convertTo(judgmentSaveVo, JudgmentDto::new)).getId();
   }

    @PostMapping("saveFill")
    @ApiOperation(value = "新增/保存填空题")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "fillSaveVo", value = "填空题信息", dataType = "FillSaveVo")
    })
    public Long saveFill(@RequestBody @Valid FillSaveVo fillSaveVo) {
        FillDto fillDto = BeanConvertUtils.convertTo(fillSaveVo, FillDto::new);
        return subjectService.saveFill(fillDto).getId();
    }

    @PostMapping("saveChoice")
    @ApiOperation(value = "新增/保存选择题")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "choiceSaveVo", value = "选择题信息", dataType = "ChoiceSaveVo")
    })
    public Long saveChoice(@RequestBody @Valid ChoiceSaveVo choiceSaveVo) {
        ChoiceDto choiceDto = BeanConvertUtils.convertTo(choiceSaveVo, ChoiceDto::new);
        List<OptionDto> optionDtos = BeanConvertUtils.convertListTo(choiceSaveVo.getOptions(), OptionDto::new);
        choiceDto.setOptions(optionDtos);
        return subjectService.saveChoice(choiceDto).getId();
    }


/*
    @PostMapping("saveFill")
    @ApiOperation(value = "新增/保存填空题")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "fill", value = "填空题信息", dataType = "Fill")
    })
    public Subject saveFill(@RequestBody @Valid Fill fill) {
        return subjectService.saveSubject(fill);
    }

    @PostMapping("saveChoice")
    @ApiOperation(value = "新增/保存选择题")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "choice", value = "选择题信息", dataType = "Choice")
    })
    public Subject saveChoice(@RequestBody @Valid Choice choice) {
        return subjectService.saveChoice(choice);
    }
*/
    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除习题", notes = "根据ID删除习题")
    @ApiImplicitParam(name = "id", value = "习题ID", required = true, paramType = "path")
    public String delete(@PathVariable Long id) {
        subjectService.removeSubject(id);
        return "success";
    }

    @ApiIgnore()
    @GetMapping("")
    @ApiOperation(value = "获取指定随堂测试的所有习题")
    public List<Subject> getSubjectsOfExamination(@RequestParam(value = "examinationId", required = true) Long examinationId) {
        return  subjectService.getSubjectsOfExaminzation(examinationId);
    }

}
