package edu.whut.cs.jee.mooc.mclass.repository;

import edu.whut.cs.jee.mooc.common.persistence.BaseRepository;
import edu.whut.cs.jee.mooc.mclass.model.Notice;

import java.util.List;

/**
 * @author wadao
 * @version 1.0
 * @date 2020/6/11 17:50
 * @site niter.cn
 */
public interface NoticeRepository extends BaseRepository<Notice, Long> {
    List<Notice> findByCourseId(Long courseId);

}
