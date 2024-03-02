package com.bunyaminkalkan.lesson24;

import branch.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import java.awt.*;

/*@Configuration
//@ComponentScan(useDefaultFilters = false,
//        basePackages = "branch", includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION,
//        classes = Muno.class))
//@ComponentScan(useDefaultFilters = false,
//        basePackages = "branch",
//        includeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,
//                classes = MyClass3.class))
//@ComponentScan(basePackages = "branch",
//        useDefaultFilters = false,
//        includeFilters = @ComponentScan.Filter(type = FilterType.REGEX,
//                pattern = ".*[12]"))
//@ComponentScan(basePackages = "branch",
//        useDefaultFilters = false,
//        includeFilters = @ComponentScan.Filter(type = FilterType.ASPECTJ,
//                pattern = "branch.*"))
@ComponentScan(basePackages = "branch",
        useDefaultFilters = false,
        includeFilters = @ComponentScan.Filter(type = FilterType.ASPECTJ,
                pattern = "branch.*"),
        excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,
                classes = MyClass3.class))
public class MyConfiguration {

    @Autowired
    private MyClass1 myClass1;

    @Autowired
    private MyClass2 myClass2;

    @Autowired
    private MyClass3 myClass3;

    @Autowired
    private MyClass4 myClass4;
}*/
