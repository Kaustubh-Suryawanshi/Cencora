package com.pack.sample;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class helloController {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String printHello(ModelMap modelMap)
    {
        modelMap.addAttribute("message","Hello !!this is Spring mvc application");

        return "hello";
    }

}
