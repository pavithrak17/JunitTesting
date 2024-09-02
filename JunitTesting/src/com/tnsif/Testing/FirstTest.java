package com.tnsif.Testing;

import org.junit.jupiter.api.Test;
//@Test is not allowed in class , only it is allowed for method 
public class FirstTest {
	@Test
	void display() {
		System.out.println("My test method");
	}
	@Test
	void Hello() {
		System.out.println("greet");
	}
}
