package pl.jakubgajewski.userapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import pl.jakubgajewski.userapi.models.Login;
import pl.jakubgajewski.userapi.models.User;
import pl.jakubgajewski.userapi.models.services.UserService;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class UserController {

    @Autowired
    public UserService userService;

    @GetMapping(value = "/register")
    public ModelAndView getRegister(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView("register");
        modelAndView.addObject("user", new User());
        return modelAndView;
    }

    @PostMapping(value = "/register")
    public ModelAndView postRegister(HttpServletRequest request, HttpServletResponse response,
                                 @ModelAttribute("user") User user) {
        userService.register(user);
        return new ModelAndView("Hello", "name", user.getName());
    }

    @GetMapping(value = "/login")
    public ModelAndView getLogin(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("zero");
        ModelAndView modelAndView = new ModelAndView("login");
        modelAndView.addObject("login", new Login());
        return modelAndView;
    }

    @PostMapping(value = "/login")
    public ModelAndView postLogin(HttpServletRequest request, HttpServletResponse response,
                                  @ModelAttribute("login") Login login){
        System.out.println("raz");
        ModelAndView modelAndView = null;//TODO - nie validateUser, ale...?
        System.out.println("dwa");
        User user = userService.validateUser(login);
        System.out.println("trzy");
        if (null != user) {
            System.out.println("spełnione");
            modelAndView = new ModelAndView("welcome");
            modelAndView.addObject("message", "Invalid login or password");
        }
        return modelAndView;
    }

    @GetMapping(value = "/test")
    @ResponseBody
    public String kasza(HttpServletRequest request, HttpServletResponse response) {
        return "Test";
    }

}
