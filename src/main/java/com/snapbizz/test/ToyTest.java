package com.snapbizz.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.snapbizz.core.Toy;

public class ToyTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.snapbizz.core");
		Toy toy = context.getBean("toy", Toy.class);
		System.out.println(toy);
		System.out.println("gitdemo");
	}
}
