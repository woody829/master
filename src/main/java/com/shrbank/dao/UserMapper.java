package com.shrbank.dao;

import com.shrbank.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by woody on 2017/9/8.
 */
@Mapper
public interface UserMapper {
    public UserEntity getUser(String id);
    public List<UserEntity> getUserNew();
}
