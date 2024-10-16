package com.pack.sample2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoAddController {
    @RequestMapping("/")
    public String home()
    {
        return "index";
    }

    @RequestMapping("add")
    public ModelAndView add(@RequestParam("num1")int i , @RequestParam("num2") int j)
    {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("result");

        int ans = i + j;

        mv.addObject("ans",ans);

        return  mv;

    }
}
