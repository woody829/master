package com.shrbank.entity;

/**
 * Created by woody on 2017/9/20.
 */
public class DeptEntity extends  BaseDTO{
    int deptId;
    String name;
    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
