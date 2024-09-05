package com.pack.LogPro.controller;


import com.pack.LogPro.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class SignUpController {
    @RequestMapping(value = "/signup")
    public String login(){
        return "signup";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public ModelAndView helloPerson(HttpServletRequest req, HttpServletResponse res)
    {
        ModelAndView modelAndView= new ModelAndView();
        String name= req.getParameter("name");
        int age=Integer.parseInt(req.getParameter("age"));
        String gender= req.getParameter("gender");
        String uname=req.getParameter("uname");
        String pass= req.getParameter("pass");

        User user=new User(name,age,gender,uname,pass);
        modelAndView.setViewName("login");
        modelAndView.addObject("LogInobj", user);
        return modelAndView;
    }

}
