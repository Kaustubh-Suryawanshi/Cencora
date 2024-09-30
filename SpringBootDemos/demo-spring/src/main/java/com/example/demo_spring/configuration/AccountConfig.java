package com.example.demo_spring.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
@ComponentScan("com.example.demo_spring")
@EnableAspectJAutoProxy
public class AccountConfig {

}
