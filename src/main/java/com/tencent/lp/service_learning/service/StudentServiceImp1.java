package com.tencent.lp.service_learning.service;

import com.tencent.lp.service_learning.dao.StudentDao;
import com.tencent.lp.service_learning.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImp1 implements StudentService {
    private final StudentDao dao;

    @Autowired
    public StudentServiceImp1(StudentDao dao) {
        this.dao = dao;
    }

    @Override
    public List<Student> selectAll() {
        return dao.selectAll();
    }
}
