package com.InsertionSort;

public class BubbleSort {

	public void printArray(int a[]) {
		int i;
		int n = a.length;
		for (i = 0; i < n; i++)
			System.out.println(a[i] + "");
	}

	public void  bubbleSort(int a[]) {
		int n = a.length;
		int i;
		int j;
		int temp;
		for(i=0;i<n;i++) {
			for(j=i+1;j<n;j++) {
				if(a[j]<a[i]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		
	
		
		}	
		
	}

	public static void main(String[] args) {
		int a[] = { 45, 50, 23, 21, 78, 11, 34 };

		BubbleSort i = new BubbleSort();
		System.out.println("before sorting array element are");
		i.printArray(a);
		i.bubbleSort(a);
		System.out.println("after sorting array element are");

		i.printArray(a);
		System.out.println();
	}

}
