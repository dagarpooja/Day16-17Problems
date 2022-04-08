package com.InsertionSort;

public class InsertionSort {

	void insert(int a[]) {
		int i, j, temp;
		int n = a.length;
		for (i = 1; i < n; i++) {

			temp = a[i];
			j = i - 1;
			while (j >= 0 && temp <= a[j]) {
				a[j + 1] = a[j];
				j = j - 1;
			}
			a[j + 1] = temp;
		}
	}

	void printNumber(int a[]) {
		int i;
		int n = a.length;
		for (i = 0; i < n; i++)
			System.out.println(a[i] + "");

	}

	public static void main(String[] args) {
		int a[] = { 45, 50, 23, 21, 78, 11, 34 };

		InsertionSort i = new InsertionSort();
		System.out.println("before sorting array element are");
		i.printNumber(a);
		i.insert(a);
		System.out.println("after sorting array element are");

		i.printNumber(a);
		System.out.println();

	}

}
