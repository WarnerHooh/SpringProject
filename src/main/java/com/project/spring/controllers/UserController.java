package com.project.spring.controllers;

import com.project.spring.models.User;
import com.project.spring.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
/**
 * Created by hjhu on 21/11/2016.
 */
@Controller
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ModelAndView doGetUsers() {
        List<User> usersList = userService.getAllUser();
        ModelAndView model = new ModelAndView();
        model.addObject("usersList", usersList);
        model.setViewName("users");
        return model;
    }

    @RequestMapping(value = "/{userId}", method = RequestMethod.GET)
    public ModelAndView doGetUser(@PathVariable int userId, @RequestParam(value = "age", required = false) Integer age) {
        User user = userService.getUserById(userId);
        ModelAndView model = new ModelAndView();
        model.addObject("name", user.getName());
        model.addObject("age", null != age ? age : user.getAge());
        model.setViewName("hello");
        return model;
    }

    @RequestMapping(value = "/api", method = RequestMethod.GET)
    public @ResponseBody
    User api() {
        User user = userService.getUserById(1);
        return user;
    }
}
