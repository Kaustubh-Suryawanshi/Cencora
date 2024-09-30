package com.testPrac.springTestExample.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(SpringExtension.class)
@WebMvcTest(HelloController.class)
class HelloControllerIntTest {
    @Autowired
    private MockMvc mvc;

    @Test
    void hello() throws Exception{
        RequestBuilder req=get("/hello");
        MvcResult result=mvc.perform(req).andReturn();
        assertEquals("Hello, world",result.getResponse().getContentAsString());
    }

    @Test
    public void testHelloWithName() throws Exception{
        mvc.perform(get("/hello?name=Kaustubh")).andExpect(content().string("Hello, Kaustubh"));
    }


}