package com.java.springboot.Config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmpConfig {

    @Bean
    public ModelMapper mapper(){
        return new ModelMapper();
    }
}
