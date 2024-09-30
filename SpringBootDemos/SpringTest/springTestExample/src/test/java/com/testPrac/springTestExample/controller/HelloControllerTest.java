package com.testPrac.springTestExample.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class HelloControllerTest {

    @Test
    void hello(){
        HelloController helloController=new HelloController();
        String respose= helloController.hello("world");
        assertEquals("Hello, world",respose);
    }
  
}