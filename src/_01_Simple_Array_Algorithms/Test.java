package _01_Simple_Array_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

class Test {
	Calculator calculator = new Calculator();
	
	@org.junit.jupiter.api.Test
	void test() {
		assertTrue(2+1==3);
	}
	
	@org.junit.jupiter.api.Test
	void test1() {
		assertFalse(2+2==3);
	}
	
	@org.junit.jupiter.api.Test
	void test2() {
		assertEquals(42,42);
	}
	
	@org.junit.jupiter.api.Test
	void test3() {
		assertNotEquals(1,75);
	}
	
	@org.junit.jupiter.api.Test
	void calculatorAdd() {
		assertEquals(66,calculator.add(2,64));
	}
	
	@org.junit.jupiter.api.Test
	void calculatorSubtract() {
		assertEquals(41,calculator.subtract(47, 6));
	}
	
	@org.junit.jupiter.api.Test
	void calculatorMultiply() {
		assertEquals(48,calculator.multiply(6,8));
	}

	@org.junit.jupiter.api.Test
	void calculatorMultiply2() {
		System.out.println(calculator.multiply(.1,.1));
		assertEquals(0.01,calculator.multiply(.1,.1),0.0001);
	}
}

