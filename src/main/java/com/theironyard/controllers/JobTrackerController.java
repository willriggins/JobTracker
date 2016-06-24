package com.theironyard.controllers;

import com.theironyard.services.ApplicationRepository;
import com.theironyard.services.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by will on 6/23/16.
 */
@Controller
public class JobTrackerController {

    @Autowired
    UserRepository users;

    @Autowired
    ApplicationRepository applications;


}
