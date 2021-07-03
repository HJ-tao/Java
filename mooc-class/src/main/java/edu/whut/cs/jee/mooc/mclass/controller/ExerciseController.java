package edu.whut.cs.jee.mooc.mclass.controller;

import edu.whut.cs.jee.mooc.mclass.dto.ExerciseDto;
import edu.whut.cs.jee.mooc.mclass.model.Subject;
import edu.whut.cs.jee.mooc.mclass.service.ExerciseService;
import edu.whut.cs.jee.mooc.mclass.service.SubjectService;
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

@Slf4j
@RestController
@Api(tags={"作业管理"})
@RequestMapping("/exercise")

public class ExerciseController {

    @Autowired
    private ExerciseService exerciseService;

    @Autowired
    private SubjectService subjectService;

    @PreAuthorize("hasAnyRole('TEACHER','ADMIN')")
    @PostMapping("")
    @ApiOperation(value = "新增作业", notes = "新增作业后请到问题管理接口创建习题")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "exerciseDto", value = "作业基本信息", dataType = "ExerciseDto")
    })
    public ExerciseDto save(@RequestBody @Valid ExerciseDto exerciseDto) {
        return exerciseService.saveExercise(exerciseDto);
    }

    @PreAuthorize("hasAnyRole('TEACHER','ADMIN')")
    @DeleteMapping("{id}")
    @ApiOperation(value = "删除作业", notes = "根据ID删除作业")
    @ApiImplicitParam(name = "id", value = "作业ID", required = true, paramType = "path")
    public String delete(@PathVariable Long id) {
        exerciseService.removeExcercise(id);
        return "success";
    }

    @GetMapping("")
    @ApiOperation(value = "获取作业", notes = "根据课程ID获取所有作业")
    public List<ExerciseDto> getExercises(@RequestParam(value = "courseId", required = true) Long courseId) {
        return  exerciseService.getExercises(courseId);
    }

    @ApiOperation(value = "获取作业的习题", notes = "根据作业ID获取作业含的所有习题")
    @GetMapping(value = "{id}/subject")
    public List<Subject> getSubjects(@PathVariable Long id) {
        return subjectService.getSubjectsOfExercise(id);
    }

}
