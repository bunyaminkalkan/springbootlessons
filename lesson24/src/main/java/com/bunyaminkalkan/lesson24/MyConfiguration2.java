package com.bunyaminkalkan.lesson24;

import branch.MyClass1;
import branch.MyClass2;
import branch.MyClass3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(basePackages = "branch",
        useDefaultFilters = false,
        includeFilters = @ComponentScan.Filter(type = FilterType.CUSTOM,
                classes = MyCustomFilter.class))
public class MyConfiguration2 {

//    @Autowired
//    private MyClass1 myClass1;

    @Autowired
    private MyClass2 myClass2;

//    @Autowired
//    private MyClass3 myClass3;
}
