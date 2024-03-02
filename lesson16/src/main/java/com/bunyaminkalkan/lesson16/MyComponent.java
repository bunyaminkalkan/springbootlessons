package com.bunyaminkalkan.lesson16;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class MyComponent {

    public MyComponent(){
        System.out.println("My component bean initialized");
    }
}
