package javaExample;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
	
	int a[] = new int[5];
	System.out.println("enter the elements in array");
	
	
	Scanner Sc = new Scanner(System.in);
	for(int i=0;i<5;i++) 
	{
		a[i]=Sc.nextInt();
		
		
		Arrays.sort(a);
		System.out.println("sorted Array elements");
		
		
		System.out.println("\nArray Elements: ");
		
		
		for(int b : a) {
			
			
			System.out.println(b+" ");
		}
	}
	}
}
	

	

	
	


