package com.bunyaminkalkan.lesson22;

import branch.MyComponent;
import branch.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = "branch")
//@ComponentScan(basePackageClasses = {MyComponent.class})
//@ComponentScan(useDefaultFilters = false)
public class Lesson22Application {

/*    @Autowired
    private MyComponent myComponent;

    @Autowired
    private MyService myService;*/

/*    @Autowired
    private MyController myController;*/



    public static void main(String[] args) {
        SpringApplication.run(Lesson22Application.class, args);
    }

}
