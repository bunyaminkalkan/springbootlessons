package com.bunyaminkalkan.lesson21;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FirstController {

    @Autowired
    private MyComponent myComponent;

    @GetMapping("/first-controller")
    public String getNameOfComponent(){
        return this.myComponent.getName();
    }

}
