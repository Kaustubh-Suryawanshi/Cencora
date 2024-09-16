package com.bankExample.microservicesDemo1_a.config;


import com.bankExample.microservicesDemo1_a.feignclient.AddressClient;
import com.bankExample.microservicesDemo1_a.response.AddressResponse;
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

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }


}
