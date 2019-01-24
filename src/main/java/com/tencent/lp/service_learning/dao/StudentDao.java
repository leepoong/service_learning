package com.tencent.lp.service_learning.dao;

import com.tencent.lp.service_learning.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface StudentDao {
    List<Student> selectAll();
}
