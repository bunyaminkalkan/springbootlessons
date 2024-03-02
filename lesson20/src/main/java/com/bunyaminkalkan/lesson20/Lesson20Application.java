package com.bunyaminkalkan.lesson20;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Lesson20Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext applicationContext = SpringApplication.run(Lesson20Application.class, args);

//        System.out.println(applicationContext.getClass());

        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();

        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }

    }
}
