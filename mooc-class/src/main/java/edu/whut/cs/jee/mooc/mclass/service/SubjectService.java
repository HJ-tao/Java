package edu.whut.cs.jee.mooc.mclass.service;

import edu.whut.cs.jee.mooc.common.exception.APIException;
import edu.whut.cs.jee.mooc.common.exception.AppCode;
import edu.whut.cs.jee.mooc.common.util.BeanConvertUtils;
import edu.whut.cs.jee.mooc.mclass.dto.ChoiceDto;
import edu.whut.cs.jee.mooc.mclass.dto.FillDto;
import edu.whut.cs.jee.mooc.mclass.dto.JudgmentDto;
import edu.whut.cs.jee.mooc.mclass.dto.OptionDto;
import edu.whut.cs.jee.mooc.mclass.model.*;
import edu.whut.cs.jee.mooc.mclass.repository.OptionRepository;
import edu.whut.cs.jee.mooc.mclass.repository.SubjectRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Slf4j
@Service
@Transactional
public class SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

    @Autowired
    private OptionRepository optionRepository;

    public Choice saveChoice(Choice choice) {
        List<Option> options = choice.getOptions();
        for (Option option : options) {
            optionRepository.save(option);
        }
        return subjectRepository.save(choice);
    }

    public Subject saveSubject(Subject subject) {
        return subjectRepository.save(subject);
    }

    public JudgmentDto saveJudgment(JudgmentDto judgmentDto) {
        Judgment judgment = BeanConvertUtils.convertTo(judgmentDto, Judgment::new);
        judgment = subjectRepository.save(judgment);
        return BeanConvertUtils.convertTo(judgment, JudgmentDto::new);
    }

    public ChoiceDto saveChoice(ChoiceDto choiceDto) {
        Choice choice = BeanConvertUtils.convertTo(choiceDto, Choice::new);
        List<OptionDto> optionDtos = choiceDto.getOptions();
        List<Option> options = BeanConvertUtils.convertListTo(optionDtos, Option::new);
        choice.setOptions(options);
        choice = subjectRepository.save(choice);
        return BeanConvertUtils.convertTo(choice, ChoiceDto::new);
    }

    public FillDto saveFill(FillDto fillDto) {
        Fill fill = BeanConvertUtils.convertTo(fillDto, Fill::new);
        fill = subjectRepository.save(fill);
        return BeanConvertUtils.convertTo(fill, FillDto::new);
    }

    public List<Subject> getSubjectsOfExaminzation(Long examinationId) {
        Sort sort = new Sort(Sort.Direction.ASC, "id");
        List<Subject> subjects = subjectRepository.findByExaminationId(examinationId, sort);
        return subjects;
    }

    public List<Subject> getSubjectsOfExercise(Long exerciseId) {
        Sort sort = new Sort(Sort.Direction.ASC, "id");
        List<Subject> subjects = subjectRepository.findByExerciseId(exerciseId, sort);
        return subjects;
    }

    public void removeSubject(Long subjectId) {
        if (!subjectRepository.existsById(subjectId)) {
            throw new APIException(AppCode.NO_SUBJECT_ERROR, AppCode.NO_SUBJECT_ERROR.getMsg() + subjectId);
        }
        subjectRepository.deleteById(subjectId);
    }
}
