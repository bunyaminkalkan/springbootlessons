package com.bunyaminkalkan.lesson26;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "branch", useDefaultFilters = false)
public class Lesson26Application {

    public static void main(String[] args) {
        SpringApplication.run(Lesson26Application.class, args);
    }

}
