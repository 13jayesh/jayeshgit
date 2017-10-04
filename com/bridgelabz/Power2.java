
/********************************************************************************
 * Purpose: power of two
 *
 * @author:  jayesh patil
 * @version: V1.0
 * @since:   7-8-2017
 *********************************************************************************/

// package com.bridgelabz.util;
public class Power2 
{
public static void two(int x)
{
double b=0;
double i;
for(i=1;i<x;i++)
{
b=Math.pow(2,i);

System.out.println("powers of 2 is"+b );
}
}
public static void main(String args[])
{
int x=Integer.parseInt(args[0]);	


two(x);
}
}
