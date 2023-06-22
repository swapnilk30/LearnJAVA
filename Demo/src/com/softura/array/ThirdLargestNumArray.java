/* Java Program to find Third Largest Number in an Array*/
package com.softura.array;

import java.util.Arrays;

public class ThirdLargestNumArray {

	public static void main(String[] args) {
		int arr[]= {10,30,40,80,90,40,60,70};
		int thirdLargest = getThirdLargest(arr,3);
		System.out.println(thirdLargest);
	}

	private static int getThirdLargest(int[] arr,int x) {
		int i,j, temp=0;
		int len=arr.length;
		for(i=0;i<arr.length;i++) {
			for(j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr[x];
		
	}


}
