package com.tnsif.Testing;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

	public class AssumptionDemo {
		@Test
		
		public void testAssumption() {
			
			int a=5 ,s=25;
			Assumptions.assumeTrue(s==a*a);
			System.out.println("will it be displayed");
		}
	@Test
	public void test() {
		int a=9,b=9;
		Assumptions.assumingThat(a!=b, ()-> System.out.println("will it be displayed"));
	}
	}