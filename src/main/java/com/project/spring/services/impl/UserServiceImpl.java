package com.project.spring.services.impl;

import com.project.spring.daos.UserMapper;
import com.project.spring.models.User;
import com.project.spring.services.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by hjhu on 17/11/2016.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> getAllUser() {
        return userMapper.findAll();
    }

    @Override
    public User getUserById(int id) {
        return userMapper.findById(id);
    }
}
