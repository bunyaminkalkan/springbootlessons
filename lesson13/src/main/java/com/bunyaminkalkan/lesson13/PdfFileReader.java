package com.bunyaminkalkan.lesson13;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("PDF")
//@Primary
public class PdfFileReader implements Reader{

    @Override
    public String readFile() {
        return "Pdf File";
    }
}
