/******************************************************************************
 *  Compilation:  javac -d bin threenames.java
 *  Execution:    java -cp bin com.threenames.util.PrimeChecker n
 *  
 *  Purpose: print three number as required.
 *
 *  @author  jayesh patil
 *  @version 1.0
 *  @since   11-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;

 public class carlone
{
public static void main(String  args[])
{
	
	double p= Double.parseDouble(args[0]);
	double R= Double.parseDouble(args[1]);
	double y=Double.parseDouble(args[2]);
	
	double r,n,pay;
	n=12*y;
	r=R/(12*100);
	pay=p*r/(1-(Math.pow(1+r,(-n))));
	
     
	 {
		 
		 System.out.println("payment is"+pay);
	 }	 
}
}
  