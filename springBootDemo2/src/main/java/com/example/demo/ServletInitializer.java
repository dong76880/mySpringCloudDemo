package com.example.demo;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringBootDemo2Application.class);
	}

	public static void main(String[] args) {
		String argsCopy = "test branch!";
		System.out.println("argsCopy："+argsCopy);
		System.out.println("123456");
		System.out.println("branch test1");
		System.out.println("branch test2");
		System.out.println("branch test3");
		System.out.println("branch test4");
		System.out.println("branch test5--3");
	}
}
