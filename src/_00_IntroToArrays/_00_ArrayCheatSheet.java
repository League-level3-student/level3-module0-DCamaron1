package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] array = new String[5]; 
		//2. print the third element in the array
		array[2]= "test";
		System.out.println(array[2]);
		//3. set the third element to a different value
		array[2]= " a different value";
		//4. print the third element again
		System.out.println(array[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for (int i = 0; i < array.length; i++) {
			array[i]= " a string of your choice";
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		//7. make an array of 50 integers
		int[] intArray = new int[50];
		//8. use a for loop to make every value of the integer array a random number
		Random number = new Random();
		for (int i = 0; i < intArray.length; i++) {
			intArray[i]=number.nextInt(101);
		}
		//9. without printing the entire array, print only the smallest number on the array
		int smallestNum = Integer.MAX_VALUE;
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i]<smallestNum) {
				smallestNum=intArray[i];
			}
		}
		System.out.println("smallest number is " + smallestNum);
		//10 print the entire array to see if step 8 was correct
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		//11. print the largest number in the array.
		int largestNum = Integer.MIN_VALUE;
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i]>largestNum) {
				largestNum=intArray[i];
			}
		}
		System.out.println("the largest number is " + largestNum);
		//12. print only the last element in the array
		System.out.println(intArray[intArray.length-1]);
	}
}
