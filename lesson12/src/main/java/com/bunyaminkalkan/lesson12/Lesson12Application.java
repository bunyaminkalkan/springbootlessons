package com.bunyaminkalkan.lesson12;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Lesson12Application {

    public static void main(String[] args) {
        SpringApplication.run(Lesson12Application.class, args);
    }

    @Bean
    public SecondClass getSecondClass(){
        return new SecondClass();
    }

}


