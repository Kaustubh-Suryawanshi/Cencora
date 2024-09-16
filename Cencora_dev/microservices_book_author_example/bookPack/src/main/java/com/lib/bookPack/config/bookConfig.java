package com.lib.bookPack.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ui.Model;

@Configuration
public class bookConfig {
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
