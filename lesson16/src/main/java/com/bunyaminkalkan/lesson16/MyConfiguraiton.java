package com.bunyaminkalkan.lesson16;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@Lazy
public class MyConfiguraiton {

    public MyConfiguraiton() {
        System.out.println("MyConfiguraiton bean initialized");
    }

    @Bean
    public Example1 getExample1(){
        return new Example1();
    }

    @Bean
    public Example2 getExample2(){
        return new Example2();
    }
}
