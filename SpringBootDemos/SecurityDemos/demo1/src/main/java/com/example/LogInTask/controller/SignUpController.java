package com.example.LogInTask.controller;


import com.example.LogInTask.model.User;
import com.example.LogInTask.repo.UserRepo;
import com.example.LogInTask.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class SignUpController {
    @Autowired
    private final UserService userService;

    public SignUpController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")
    public String login()
    {
        return "lgn.jsp";
    }


    public void addUser( User user){
        userService.saveUser(user);

    }

    @PostMapping("/addUser")
    public ModelAndView signup(HttpServletRequest req, HttpServletResponse res) {
        ModelAndView modelAndView = new ModelAndView();
        String name= req.getParameter("name");
        String age=req.getParameter("age");
        String gender= req.getParameter("gender");
        String uname = req.getParameter("uname");
        String pass = req.getParameter("pass");

        User user=new User(name,age,gender,uname,pass);
        addUser(user);
        modelAndView.setViewName("lgn.jsp");
        return modelAndView;
    }

    @PostMapping("/dashboard")
    public ModelAndView login(HttpServletRequest req, HttpServletResponse res) {
        ModelAndView modelAndView = new ModelAndView();
        String uname = req.getParameter("uname");
        String pass = req.getParameter("pass");

        User user2=new User(uname,pass);
        List<User> users=userService.getAccountDetails();
        modelAndView.addObject("obj",user2);
//        if(users.contains(user2) && pass.equals(users.get(users.indexOf(user2)).getPass()))
        modelAndView.setViewName("dashboard.jsp");

        return modelAndView;
    }




//    @GetMapping("/")
//    public List<User> getAccountDetails(){
//        return userRepo.findAll();
//    }

}
