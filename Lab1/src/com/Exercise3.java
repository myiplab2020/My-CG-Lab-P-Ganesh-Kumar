package com;
import java.util.Scanner;

public class Exercise3 {
    static int recr(int n) 
    { 
        if (n <= 1) 
            return n; 
        return recr(n - 1) + recr(n - 2); 
    } 
    static int nrecr(int n) {
    	if(n<=1)
    		return n;
    	int a = 1,b = 1,c = 0;
    	for(int i=2;i<n;++i) {
    		c = a+b;
    		a = b;
    		b = c;
    	}
    	return c;
    }
	
    public static void main(String args[]) 
    { 
    	Scanner s = new Scanner(System.in);
    	System.out.println("Enter the n");
    	int n = s.nextInt();
    	System.out.println(recr(n));
    	System.out.println(nrecr(n));
    } 


}
