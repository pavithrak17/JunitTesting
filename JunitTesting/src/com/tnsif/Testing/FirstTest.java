package com.tnsif.Testing;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
//@Test is not allowed in class , only it is allowed for method 
public class FirstTest {
	//@Disabled()
	@DisplayName("My Test 1")
	@Test
	void display() {
		System.out.println("My test method");
	}
	@RepeatedTest(4)
	@DisplayName("My Test 2")
	@Test
	void Hello() {
		System.out.println("greet");
	}
}