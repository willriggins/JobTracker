package com.theironyard.controllers;

import com.theironyard.entities.Application;
import com.theironyard.entities.User;
import com.theironyard.services.ApplicationRepository;
import com.theironyard.services.UserRepository;
import com.theironyard.utils.PasswordStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

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
    public String home(HttpSession session, Model model) {
        String username = (String) session.getAttribute("username");

        if (username != null) {
            User user = users.findByName(username);
            Iterable<Application> apps;
            apps = applications.findByUser(user);
            model.addAttribute("username", username);
            model.addAttribute("applications", apps);
        }
        return "home";
    }

    @RequestMapping(path = "/login", method = RequestMethod.POST)
    public String login(String username, String password, HttpSession session) throws Exception {
        User user = users.findByName(username);
        if (user == null) {
            user = new User(username, PasswordStorage.createHash(password));
            users.save(user);
        }
        else if (!PasswordStorage.verifyPassword(password, user.getPassword())) {
            return "alert";
        }
        session.setAttribute("username", username);
        return "redirect:/";
    }

    @RequestMapping(path = "/logout", method = RequestMethod.POST)
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }

    @RequestMapping(path = "/add-application", method = RequestMethod.POST)
    public String add(HttpSession session, String companyName, String contactName, String contactPhoneNumber, String positionTitle, String companyLogo) {
        String username = (String) session.getAttribute("username");
        User user = users.findByName(username);
        Application application = new Application(companyName, contactName, contactPhoneNumber, positionTitle, companyLogo, user);
        applications.save(application);
        return "redirect:/";
    }

    @RequestMapping(path = "/delete-application", method = RequestMethod.POST)
    public String delete(int id) {
        applications.delete(id);
        return "redirect:/";
    }


}
