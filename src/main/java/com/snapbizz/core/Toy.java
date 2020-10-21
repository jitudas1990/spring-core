package com.snapbizz.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:com/snapbizz/test/toy.properties")
public class Toy {
	@Value("${toyName}")
	private String name;
	@Value("${age}")
	private int age;
	@Override
	public String toString() {
		return "Toy [name=" + name + ", age=" + age + "]";
	}
	
	
}
