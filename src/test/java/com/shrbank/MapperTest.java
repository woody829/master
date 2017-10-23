package com.shrbank;

import com.shrbank.dao.LearnResouceDao;
import com.shrbank.dao.StudentMapper;
import com.shrbank.entity.StudentEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by woody on 2017/8/29.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes=Application.class)
public class MapperTest {

    @Autowired
    private LearnResouceDao dao;

    @Autowired
    private StudentMapper studentDao;

    @Test
    public void getStudentName() throws Exception {
//        StudentEntity studentEntity = new StudentEntity();
        List<StudentEntity> list = studentDao.getStudentAll();
        for(StudentEntity studentEntity:list) {
            System.out.println(studentEntity.getStudentName());
        }
    }
}