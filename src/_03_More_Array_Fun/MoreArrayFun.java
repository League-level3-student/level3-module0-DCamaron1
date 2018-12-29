package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	String[] names = { "Esme", "John", "David", "Isis", "Michiyo" };

	// 1. Create a main method to test the other methods you write.
	public static void main(String[] args) {

	}

	public static String printAll(String[] names) {
		String namesString = "";
		for (int i = 0; i < names.length; i++) {
			if (i == names.length-1) {
				namesString = namesString + names[i];
			}
			else {
				namesString = namesString + names[i] + " ";
			}
		}
		return namesString;
	}

	public static String reversePrintAll(String[] names2) {
		String namesString = "";
		for (int i = names2.length; i >= 0; i--) {
			if (i == names2.length+1) {
				namesString = namesString + names2[i];
			}
			else {
				namesString = namesString + names2[i] + " ";
			}
		}
		return namesString;
	}

	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.
	
	// 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in reverse order.

	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.

	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in a completely random order. Almost every run of the program should result
	// in a different order.

}
