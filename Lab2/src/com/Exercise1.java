package com;
import java.util.Arrays;
import java.util.Scanner;
public class Exercise1 {

		
		public static int getSecondSmallest(int[] array) {
			Arrays.sort(array);
			return array[1];
		}

		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.print("Enter the array size : ");
			int n = s.nextInt();
			int[] a = new int[n];
			System.out.println("Enter the elements : ");
			for(int i=0;i<n;i++) {
				a[i]=s.nextInt();
			}
			int k  = getSecondSmallest(a);
			System.out.println("The Second Smallest Element is : "+k);

		}

	}

