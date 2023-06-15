package com.softura.array;

//Program to find the frequency of each element in the array
//arr[] ={1, 2, 8, 3, 2, 2, 2, 5, 1 }
public class FrequencyOfEachElement {
	
	public static void main(String[] args) {
		int arr[]={1,2,8,3,2,2,2,5,1};
		int visited=-1;
		int fr[]=new int[arr.length];
		//System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					fr[j]=visited;
				}
				
			}
			
		}
	}

}
