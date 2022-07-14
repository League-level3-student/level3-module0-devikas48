package _00_Intro_To_Arrays;

import java.util.Random;

public class _01_IntroToArrays {
    public static void main(String[] args) {
        // 1. declare and Initialize an array 5 Strings
    	
    	String[] fruit = new String[5];
    	
    	fruit[0] = "Apples";
    	fruit[1] = "Oranges";
    	fruit[2] = "Berries";
    	fruit[3] = "Pears";
    	fruit[4] = "Kiwis";

    	System.out.println("////////////////");

        // 2. print the third element in the array
    	
    	System.out.println(fruit[2]);
    	System.out.println("////////////////");

        // 3. set the third element to a different value
    	
    	fruit[2] = "Lettuce";
    	System.out.println("////////////////");

        // 4. print the third element again
    	System.out.println(fruit[2]);

    	
    	System.out.println("////////////////");

        // 5. use a for loop to set all the elements in the array to a string
        //    of your choice
    	
    	for (int i = 0; i < fruit.length; i++) {
    		fruit[i] = "Lemon";
		}
System.out.println("////////////////");


        // 6. use a for loop to print all the values in the array
        //    BE SURE TO USE THE ARRAY'S length VARIABLE
    	for (int i = 0; i < fruit.length; i++) {
			System.out.println(fruit[i]);
		}
    	
    	System.out.println("////////////////");

        // 7. make an array of 50 integers
    	
    	int[] ints = new int[50];
    			

        // 8. use a for loop to make every value of the integer array a random
        //    number
    	
    	Random ran = new Random();
    	for (int i = 0; i < ints.length; i++) {
			ints[i] = ran.nextInt();
			System.out.println(ints[i]);
		}
    	System.out.println("////////////////");

        // 9. without printing the entire array, print only the smallest number
        //    on the array
    	int size = ints.length;
    	int temp;
    	for (int i = 0; i < ints.length; i++) {
			for (int j = i + 1; j < ints.length; j++) {
				if(ints[i]>ints[j]) {
					temp = ints[i];
					ints[i] = ints[j];
					ints[j] = temp;
				}
			}
		}
    	System.out.println("Smallest number is:" +ints[0]);
    	
    	
    	System.out.println("////////////////");

        // 10 print the entire array to see if step 8 was correct
    	for (int i = 0; i < ints.length; i++) {
    		System.out.println(i);
    	}
    	System.out.println("////////////////");


        // 11. print the largest number in the array.
    	for (int i = 0; i < ints.length; i++) {
			for (int j = i + 1; j < ints.length; j++) {
				if(ints[i]>ints[j]) {
					temp = ints[i];
					ints[i] = ints[j];
					ints[j] = temp;
				}
			}
		}
    	System.out.println("Largest number is:" +ints[size-1]);
    	
    	System.out.println("////////////////");

        // 12. print only the last element in the array
System.out.println(ints[ints.length-1]);
    }
}