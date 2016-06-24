package com.theironyard.controllers;

import com.theironyard.services.ApplicationRepository;
import com.theironyard.services.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by will on 6/23/16.
 */
@Controller
public class JobTrackerController {

    @Autowired
    UserRepository users;

    @Autowired
    ApplicationRepository applications;

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String home() {
        return "home";
    }

}
