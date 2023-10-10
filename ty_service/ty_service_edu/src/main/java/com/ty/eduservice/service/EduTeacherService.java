package com.ty.eduservice.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ty.eduservice.entity.EduTeacher;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * <p>
 * 讲师 服务类
 * </p>
 *
 * @author yishuai666
 * @since 2023/9/12
 */
public interface EduTeacherService extends IService<EduTeacher> {
    //1 分页查询讲师的方法
    Map<String, Object> getTeacherFrontList(Page<EduTeacher> pageTeacher);
}
