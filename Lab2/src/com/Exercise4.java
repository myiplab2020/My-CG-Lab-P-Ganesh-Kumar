package com;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise4{  
public static int modifyArray(int arr[], int n){  
		Arrays.sort(arr);
        if (n==0 || n==1){  
            return n;  
        }  
        int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];      
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  
        return j;  
    }  
       
    public static void main (String[] args) {  
    	System.out.println("Enter the size of array : ");
    	Scanner s = new Scanner(System.in);
        int length = s.nextInt();
        int[] arr = new int[length];
        for(int k=0;k<length;k++) {
        	arr[k]=s.nextInt();
        }
        length = modifyArray(arr, length);  
        for (int i=0; i<length; i++)  
           System.out.print(arr[i]+" ");  
    }  
}  