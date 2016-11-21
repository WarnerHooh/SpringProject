package com.project.spring.services;

import com.project.spring.models.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hjhu on 17/11/2016.
 */
public interface UserService {
    List<User> getAllUser();

    User getUserById(int id);
}
