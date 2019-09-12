/*
 	Java Cheatsheet
 */

package hw1;

import java.util.Scanner;
import java.util.Arrays;
import java.util.*;

public class Hw1 
{

	public static void main(String[] args) 
	{
		
		//1, 3, 4, 5
		System.out.print("Hello World, \tmy name is Emmanuelle! \nI have " + 2 + " Great Dane mixes");
		
		//2
		System.out.println();
		
		//6, 7
		int x = 10;
		double n = 1.57;
		boolean theState = true;
		char sayYes = 'Y';
		
		//8, 9
		String message = "Emmanuelle Yvette Esters";
		
		//10
		System.out.print(x + "\t" + n + "\t" + theState + "\t" + sayYes + "\t" + message + "\n");
		
		//11
		final int BIRTH_YEAR = 1995;
		System.out.println(BIRTH_YEAR);
		
		//12
		Scanner scan = new Scanner(System.in);
		
		//13
			//int
			System.out.print("Please input an integer value ");
			x = scan.nextInt();
		
			//double
			System.out.print("Please input an double value ");
			n = scan.nextDouble();
		
			//char
			System.out.print("Please input the char value (Y/N) ");
			sayYes = scan.next().charAt(0);
		
			//string
			System.out.print("Please input a string ");
			scan.nextLine(); 
			message = scan.nextLine();
		
		//14
		System.out.println("You entered: " + x + "\t" + n + "\t" + sayYes + "\t" + message + "\t");
		
		//15
		double sqrt = Math.sqrt(x);    
		double min = Math.min(x, n);   
		double max = Math.max(x, n);  
		
		System.out.println("Square root / Minimum / Maximum: " + sqrt + "\t" + min + "\t" + max);

		//16
		Random generator = new Random();
		int someInt = generator.nextInt(11) + 10;
		System.out.println(someInt);
		
		//17
		double sum; 
		double a = 9.0;
		int b = 8;
		
		sum = a + b;
		System.out.println(sum);
		
		//18
		double sub;
		
		sub = (double)a - b;
		System.out.println(sub);
		
		//19, 20, 21
		String string1 = "Hi";
		String string2 = "Hello";
		
		if ( (string1).contentEquals(string2)) {
			System.out.println("String #1 is equal to String #2");
		} else {
			System.out.println("String #1 is not equal to String #2");
		}
		
		
		//22
		for (int i = 1; i < 21; i++)
		{
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		//23
		int j = 1;
		
		while(j < 62)
		{
			if (j%2 == 0)
			{
				System.out.print(j + " ");
				j++;
			} else {
				j++;
			}
		}
		
		System.out.println();
		
		//24
		int oddNum;
		
		do 
		{
			System.out.print("Please enter an odd number: ");
			oddNum = scan.nextInt();
		} while (oddNum % 2 == 0);
		
		System.out.println("You Entered: " + oddNum);
	
		//25
		int[] intArray = new int[100];
		int arraySum = 0;
		
		for (int k = 0; k < intArray.length; k++) 
		{
			Random rand = new Random();
			intArray[k] = rand.nextInt(301);
			arraySum += intArray[k];
		} 
		
		//26
		Arrays.sort(intArray);
		int arrayMin = intArray[0];
		System.out.println("Minimum: " + arrayMin);
		
		//27
		int arrayAvg = arraySum/intArray.length;
		System.out.println("Average: " + arrayAvg);
		
	}

}
