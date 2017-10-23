package com.shrbank.entity;

import java.io.Serializable;

/**
 * Created by woody on 2017/9/20.
 */
public class UserEntity implements Serializable {
    int id;
    String name;
    int age;
    int deptId;
    DeptEntity dept;
    public DeptEntity getDept() {
        return dept;
    }

    public void setDept(DeptEntity dept) {
        this.dept = dept;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

}
