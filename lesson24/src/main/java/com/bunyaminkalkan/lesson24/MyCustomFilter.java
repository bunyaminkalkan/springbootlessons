package com.bunyaminkalkan.lesson24;

import branch.MakeComponent;
import branch.Muno;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

public class MyCustomFilter implements TypeFilter {

    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {

//        System.out.println(metadataReader.getClassMetadata().getClassName());
//
//        if(metadataReader.getClassMetadata().getClassName().contains("MyClass1")){
//            return true;
//        }

        try {
            Class clazz = Class.forName(metadataReader.getClassMetadata().getClassName());

//            if(clazz.getSimpleName().contains("MyClass1")){
//                return true;
//            }

//            if(clazz.isAnnotationPresent(Muno.class)){
//                return true;
//            }

//            if(clazz.getSimpleName().contains("3")){
//                return true;
//            }

            Class[] interfaces = clazz.getInterfaces();
            for (Class anInterface : interfaces) {
                if (anInterface.getSimpleName().equals(MakeComponent.class.getSimpleName())) {
                    return true;
                }


            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return false;
    }
}
