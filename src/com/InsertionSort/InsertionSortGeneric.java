package com.InsertionSort;

import java.util.Arrays;

public class InsertionSortGeneric<t extends Comparable<? super t>> {
	t[] a;

	public InsertionSortGeneric(t[] array) {
		super();
		this.a = array;
	}

	private t[] insert() {

		int i;

		int n = a.length;
		for (i = 1; i < n; i++) {
			int j = i;

			while (j > 0 && a[j - 1].compareTo(a[j]) > 0) {
				t temp = a[j];
				a[j] = a[j - 1];
				a[j - 1] = temp;
				j--;
			}

		}
		return a;
	}

	public static void main(String[] args) {
		Integer a[] = { 45, 50, 23, 21, 78, 11, 34 };

		InsertionSortGeneric<Integer> i = new InsertionSortGeneric<Integer>(a);
		System.out.println("before sorting array element are:" + Arrays.toString(a));

		Integer[] b = i.insert();
		System.out.println("After sorting array element are:" + Arrays.toString(b));
		
		String str1[] = {"kirti","pooja","asha" };

		InsertionSortGeneric<String> str2 = new InsertionSortGeneric<String>(str1);
		System.out.println("before sorting array element are:" + Arrays.toString(str1));

		String[] str3 = str2.insert();
		System.out.println("After sorting array element are:" + Arrays.toString(str3));
		

	}

}
