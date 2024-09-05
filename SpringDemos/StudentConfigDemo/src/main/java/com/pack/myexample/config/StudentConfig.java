package com.pack.myexample.config;

import com.pack.myexample.modl.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class StudentConfig {
    @Bean
    public Student getStudent()
    {
        return new Student(1,"Kaustubh",74.15);
    }
}
