package com.ty.eduservice.service;

import com.ty.eduservice.entity.EduSubject;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ty.eduservice.entity.subject.OneSubject;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * <p>
 * 课程科目 服务类
 * </p>
 *
 * @author yishuai666
 * @since 2023-09-21
 */
public interface EduSubjectService extends IService<EduSubject> {

    //添加课程分类
    void saveSubject(MultipartFile file,EduSubjectService subjectService);

    //课程分类列表（树形）
    List<OneSubject> getAllOneTwoSubject();
}
