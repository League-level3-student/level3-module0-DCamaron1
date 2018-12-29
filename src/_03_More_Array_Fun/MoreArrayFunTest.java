package _03_More_Array_Fun;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MoreArrayFunTest {

	@Test
	void testPrintAll() {
		String[] names = {"Esme","John","David","Isis","Michiyo"};
		String all = MoreArrayFun.printAll(names);
		assertEquals("Esme John David Isis Michiyo", all);
	}

	@Test 
	void testReversePrintAll() {
		String[] names = {"Esme","John","David","Isis","Michiyo"};
		String all = MoreArrayFun.reversePrintAll(names);
		assertEquals("Michiyo Isis David John Esme", all);
	}
		
}
