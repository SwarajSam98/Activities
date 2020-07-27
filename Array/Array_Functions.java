package com.Array;

public class Array_Functions {
	public int max(int[] arr) {
		int max= arr[0];
		for(int i=1; i<arr.length;i++) {
			if(max<arr[i]) 
				max = arr[i];
		}
		return max;
	}
	public int[] intersect(int[] arr1, int[] arr2) {
		int[] arr3 = new int[7] ;
		for(int i=0; i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i] == arr2[j]) 
					arr3[i]= arr1[i];	
			}
		}
		return arr3;
	}
	
	public int[] insertAt(int[] arr, int item, int index) {
		int n = arr.length;
		int[] arr1 = new int[8];
		for(int j= 0; j<n; j++) {
			arr1[j]= arr[j];
		}
		for(int i = (n-1); i>=(index-1); i--) {
			arr1[i+1]= arr1[i];
		}
		arr1[index-1]= item;
		return arr1;
	}
	
	public void printArray(int[] array) {
		for (int i : array) {
			System.out.println(i);;
		}
	}

	public static void main(String[] args) {
		Array_Functions Array = new Array_Functions();
		int[] arr= {10, 9, 23, 45,67, 89, 90};
		int[] arr2= {1, 9, 3, 5,7, 75, 90};
		int max = Array.max(arr);
		System.out.println("Max Element from Array is " + max);
		int[] arr3 = Array.intersect(arr, arr2); 
		System.out.println("Common Element from both the arrays are " );
		Array.printArray(arr3);
		System.out.println("Array before insert is " );
		 Array.printArray(arr);
		int[] arr4 = Array.insertAt(arr, 15, 2);
		System.out.println("Array after insert is at :" );
		Array.printArray(arr4);
		

	}

}
