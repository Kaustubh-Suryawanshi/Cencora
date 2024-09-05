package com.pack.sample.controller;

import com.pack.sample.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class PersonController {
    @RequestMapping(value = "/addPerson",method = RequestMethod.POST)
    public ModelAndView helloPerson(HttpServletRequest req, HttpServletResponse res)
    {
        ModelAndView modelAndView= new ModelAndView();
        String name= req.getParameter("name");
        int id =Integer.parseInt(req.getParameter("id"));
        int age=Integer.parseInt(req.getParameter("age"));
        Person p=new Person(id,name,age);
        modelAndView.setViewName("welcome");
        modelAndView.addObject("obj", p);
        return modelAndView;
    }

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String login()
    {
        return "person";
    }
}
