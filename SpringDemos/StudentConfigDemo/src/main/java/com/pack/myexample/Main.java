package com.pack.myexample;

import com.pack.myexample.config.StudentConfig;
import com.pack.myexample.modl.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {

        var cfg= StudentConfig.class;
        try(var context= new AnnotationConfigApplicationContext(cfg)){
            var studentObj= context.getBean("getStudent",Student.class);
            System.out.println(studentObj);
        }
    }
}