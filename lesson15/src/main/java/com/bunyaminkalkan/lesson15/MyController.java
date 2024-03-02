package com.bunyaminkalkan.lesson15;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {

    // Field injection
    //@Autowired
    //private FirstClass firstClass;

    private SecondClass secondClass;

    private FirstClass firstClass;

    private ThirdClass thirdClass;

    @Autowired
    public MyController(FirstClass firstClass, @Qualifier("thirdClass") ThirdClass thirdClass) {
        this.firstClass = firstClass;
        this.thirdClass = thirdClass;
    }

    //Constructor injection
    public MyController(ThirdClass thirdClass) {
        this.thirdClass = thirdClass;
    }

    @GetMapping("/names")
    public String getNameOfClasses(){
        return this.firstClass.getName()
                + "-" + this.secondClass.getName()
                + "-" + this.thirdClass.getName();
    }

    //Setter injection
    @Autowired
    public void setSecondClass(SecondClass secondClass) {
        this.secondClass = secondClass;
    }
}
