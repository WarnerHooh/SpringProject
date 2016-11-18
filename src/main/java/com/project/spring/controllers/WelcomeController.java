package com.project.spring.controllers;

import com.project.spring.services.WelcomeService;
import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by hjhu on 17/11/2016.
 */
@Controller
public class WelcomeController {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
    private final WelcomeService welcomeService;

    @Autowired
    public WelcomeController(WelcomeService welcomeService) {
        this.welcomeService = welcomeService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        LOGGER.debug("get index");
        System.out.println(welcomeService.getUserById(5));
        return "index";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ModelAndView welcome() {
        ModelAndView model = new ModelAndView();
        model.addObject("name", "Hooh");
        model.setViewName("hello");
        return model;
    }
}
