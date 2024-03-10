package com.spring.student;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Student {

	Student() {
		System.out.println("Initialization.........");
	}

	public void learnSomething() {
		System.out.println("Learn something!");

	}

}
