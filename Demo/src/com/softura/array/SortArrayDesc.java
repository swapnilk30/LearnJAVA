/* Java Program to sort the elements of an array in ascending order*/
package com.softura.array;

import java.util.Arrays;

public class SortArrayDesc {
	public static void main(String[] args) {
		int arr[]= {10,30,40,80,90,40,60,70};
		int i,j, temp=0;
		for(i=0;i<arr.length;i++) {
			for(j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}System.out.println(Arrays.toString(arr));
	}

}
