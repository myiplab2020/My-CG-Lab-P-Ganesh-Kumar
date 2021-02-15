package com;

import java.text.ParseException;
import java.time.*;
import java.util.*;

public class Exercise7 {  
	
	public static void printDate(LocalDate d) {
		 LocalDate now = LocalDate.now();
	     Period diff = Period.between(d, now); 
	     System.out.print("\nThe Difference is \n"+"\n"+diff.getYears() +" years"+"\t"+
	     diff.getMonths() +" months"+" " +diff.getDays()+" days"); 
	}
	
   public static void main(String[] args) throws ParseException
    {
	    System.out.println("Enter the date in the format of \"yyyy-mm-dd\"");
	    Scanner s = new Scanner(System.in);
	    String st = s.next();
        LocalDate d = LocalDate.parse(st);
        printDate(d);
       
  }
}
