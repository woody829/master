package com.shrbank.dao;

import com.shrbank.entity.LearnResouceDTO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by woody on 2017/8/28.
 */
@Mapper
public interface LearnResouceDao {
    @Insert("insert into learn_resource(id,author,title) values(#{id},#{author},#{title})")
    int add(LearnResouceDTO learnResouce);
}
