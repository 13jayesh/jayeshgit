/********************************************************************************
 * Purpose: to find leap year.
 *
 * @author:  jayesh patil
 * @version: V1.0
 * @since:   7-8-2017
 *********************************************************************************/

//package com.bridgelabz.util;

public class LeapYear
 {
    public static void main(String args[])
	{
       int year = Integer.parseInt(args[0]);
       if((year%4==0)&&((year%400==0)&&(year%100!=0)))
	   {
	
	    System.out.println("its leap year"+year);
		}
		
	   
		else 
		{
		 System.out.println("its not leap year"+year);
		 }
		 }
 }
 