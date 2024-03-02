package com.bunyaminkalkan.lesson16;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

//    public MyComponent myComponent;

//    public MyController(MyComponent myComponent) {
//        this.myComponent = myComponent;
//    }

//    private Example1 example1;
//
//    public MyController(Example1 example1) {
//        this.example1 = example1;
//    }

    private MyConfiguraiton myConfiguraiton;

    public MyController(MyConfiguraiton myConfiguraiton) {
        this.myConfiguraiton = myConfiguraiton;
    }
}
