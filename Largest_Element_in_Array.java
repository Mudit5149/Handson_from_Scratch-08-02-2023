package javaExample;

import java.util.Scanner;

public class Largest_Element_in_Array {
	public static void main (String[] args ) {
		int arr[]=new int [5];
		Scanner sc =new Scanner(System.in);
		System.out.print("enter the elements in array");
		int value = 0;
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
			
			
			if(arr[i]> value) {
				value = arr[i];
				
			}
		}
		System.out.println("Greatest value is:" +value);
		
	}

}
