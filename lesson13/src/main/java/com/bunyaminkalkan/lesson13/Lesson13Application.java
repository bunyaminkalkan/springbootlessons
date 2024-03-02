package com.bunyaminkalkan.lesson13;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@SpringBootApplication
public class Lesson13Application {

	public static void main(String[] args) {
		SpringApplication.run(Lesson13Application.class, args);
	}

	@Bean("WORD")
	@Primary
	public WordFileReader getWordFileReader(){
		return new WordFileReader();
	}

}
