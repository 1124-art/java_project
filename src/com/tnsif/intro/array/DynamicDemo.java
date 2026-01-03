package com.tnsif.intro.array;
import java.util.*;
public class DynamicDemo {
	public static void main(String[] args) {

	   System.out.println("enter size of array:");
	   
	   Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
	   int[] arr=new int[n];
	   System.out.println("enter arr values:");
	   for(int i=0;i<n;i++) {
		  arr[i]=sc.nextInt();
	   }
	   System.out.println("array elements are:");
	   for(int i=0;i<n;i++) {
		   System.out.println(arr[i]);
	   }
	   
	}

}
