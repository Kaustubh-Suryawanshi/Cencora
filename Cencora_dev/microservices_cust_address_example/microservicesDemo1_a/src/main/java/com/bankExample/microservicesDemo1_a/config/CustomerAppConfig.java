package com.bankExample.microservicesDemo1_a.config;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.boot.web.client.RestTemplateBuilder;

@Configuration
public class CustomerAppConfig {
    @Autowired
    RestTemplateBuilder restTemplateBuilder;
    @Value("${addressservice.base.url}")
    private String addressBaseUrl;
    @Bean
    public ModelMapper modelMapper(){ return new ModelMapper();}

    @Bean
    public RestTemplate restTemplate(){
        return restTemplateBuilder.rootUri(addressBaseUrl).build();
    }

    @Bean
    public WebClient webClient(){
        return WebClient.builder().baseUrl(addressBaseUrl).build();
    }
}
