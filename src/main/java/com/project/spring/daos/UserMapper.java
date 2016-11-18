package com.project.spring.daos;

import com.project.spring.models.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by hjhu on 17/11/2016.
 */
public interface UserMapper {
    List<User> findAll();

//    @Select("select * from User where id = #{id}")
    User findById(int id);
}
