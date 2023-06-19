package com.softura.array;

import java.util.Arrays;
import java.util.Iterator;
//Java Program to Rotate the elements of an array to the left By N times
//Program to left rotate the elements of an array. arr[] ={1, 2, 3, 4, 5 }
public class RotateLeft {
	public static void main(String[] args) {
		int arr[] ={1, 2, 3, 4, 5 };
		System.out.println("Original Array "+Arrays.toString(arr));
		//n determine the number of times an array should be rotated  
		int n=3;
		//Rotate the given array by n times toward left  
		for(int i=0;i<n;i++) {
			int first=arr[0],j;
			for(j=0;j<arr.length-1;j++) {
				arr[j]=arr[j+1];
			}
			
			arr[j]=first;
			
		}
		System.out.println(Arrays.toString(arr));
		
		
	}

}
