package com.InsertionSort;

import java.util.Arrays;

public class BubbleSortGeneric<T extends Comparable<? super T>> {
		  T[] array;
		  
		  public BubbleSortGeneric(T[] array) {
			super();
			this.array = array;
		}
		
		  
		  private T[] bubbleSort(){
		    for(int i = array.length; i > 1; i--){
		      for(int j = 0; j < i - 1; j++){
		        //if greater swap elements
		        if(array[j].compareTo(array[j+1]) > 0){
		          swapElements(j, array);
		        }
		      }            
		    }
		    return array;
		  }
		  private void swapElements(int j, T[] arr){
		    T temp = arr[j];
		    arr[j] = arr[j+1];
		    arr[j+1] = temp;        
		  }
		  public static void main(String[] args) {
		    Integer[] intArr = {5,1,6,7,8,9,4,2};
		    BubbleSortGeneric<Integer> bsg1 = new BubbleSortGeneric<Integer>(intArr);
		    Integer[] sa1 = bsg1.bubbleSort();
		    System.out.println("Sorted array- " + Arrays.toString(sa1)); 
		    
		    String[] strArr = {"komal", "neha", "kirti", "pooja"};
		    BubbleSortGeneric<String> bsg2 = new BubbleSortGeneric<>(strArr);
		    String[] sa2 = bsg2.bubbleSort();
		    System.out.println("Sorted array- " + Arrays.toString(sa2));
		  }


}
