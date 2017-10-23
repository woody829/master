package com.shrbank.dao;

import com.shrbank.entity.StudentEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by woody on 2017/9/8.
 */
@Mapper
@Repository
public interface StudentMapper {
    public StudentEntity getStudent(String id);

    public StudentEntity getStudentAndClass(String id);

    public List<StudentEntity> getStudentAll();

    public void insertStudent(StudentEntity entity);

    public void deleteStudent(StudentEntity entity);

    public void updateStudent(StudentEntity entity);
}
