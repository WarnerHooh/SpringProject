package com.project.spring.daos;

import com.project.spring.models.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by hjhu on 17/11/2016.
 */
@Repository
public interface UserMapper {
    List<User> findAll();

    User findById(int id);
}
