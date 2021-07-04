package edu.whut.cs.jee.mooc.mclass.service;

import edu.whut.cs.jee.mooc.common.exception.APIException;
import edu.whut.cs.jee.mooc.common.exception.AppCode;
import edu.whut.cs.jee.mooc.common.util.BeanConvertUtils;
import edu.whut.cs.jee.mooc.mclass.dto.NoticeDto;
import edu.whut.cs.jee.mooc.mclass.model.Notice;
import edu.whut.cs.jee.mooc.mclass.repository.NoticeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

/**
 * @author wadao
 * @version 1.0
 * @date 2020/6/11 18:13
 * @site niter.cn
 */

@Slf4j
@Service
@Transactional
public class NoticeService {
    @Autowired
    private NoticeRepository noticeRepository;

    public List<NoticeDto> getNotices(Long courseId) {//获取公告列表
        List<Notice> notices = noticeRepository.findByCourseId(courseId);
        return BeanConvertUtils.convertListTo(notices, NoticeDto::new);
    }

    public NoticeDto saveNotice(NoticeDto noticeDto) {//新增公告
        Notice notice = BeanConvertUtils.convertTo(noticeDto, Notice::new);
        notice = noticeRepository.save(notice);
        noticeDto.setId(notice.getId());
        return noticeDto;
    }

    public void removeNotice(Long id) {//删除公告
        noticeRepository.deleteById(id);
    }

    public NoticeDto updateNotice(NoticeDto noticeDto) {//编辑公告
        Optional<Notice> noticeOptional = noticeRepository.findById(noticeDto.getId());
        if(noticeOptional.isPresent()){//公告存在更新
            Notice notice = noticeRepository.findById(noticeDto.getId()).get();
            BeanUtils.copyProperties(noticeDto, notice);
            noticeRepository.save(notice);
            return noticeDto;
        }else {//公告不存在抛出异常
            throw new APIException(AppCode.NO_NOTICE_ERROR);
        }
    }
}
