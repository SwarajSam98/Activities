package com.Sorting;

public class InsertionSort {
	void sort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 1; i < n; ++i) { 
            int key = arr[i]; 
            int j = i - 1; 
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        }
        
    }
	void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
	public static void main(String[] args) {
		InsertionSort obj = new InsertionSort();
		int arr[]= {34, 12, 48, 04, 9, 56, 198};
		obj.sort(arr);
		System.out.println("Sorted Array Using Insertion Sort");
		obj.printArray(arr);

	}

}
