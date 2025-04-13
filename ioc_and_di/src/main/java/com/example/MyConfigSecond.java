package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
// @ComponentScan("com.example")
public class MyConfigSecond{
     
    @Bean
    @Scope("singleton")
    public Pet catBean(){
        return new Cat();
    }

    @Bean
    public Person personBean(){
        return new Person(catBean());
    }
}
