/********************************************************************************
 * Purpose: takes a command-line argument n and prints the nth harmonic number
 *
 * @author:  jayesh patil
 * @version: V1.0
 * @since:   7-8-2017
 *********************************************************************************/

//package com.bridgelabz.util;
public class harmonicseries
{
	public static void Function(int num)
	{
	int harmonic=0,i;
	int numar=1;
	int deno=1;
	if(num>0)
	
	for(deno=1;deno<=num;deno++)
        {

	System.out.println(numar+"/"+deno);
	}
	}
public static void main(String args[])
	{
	  int num = Integer.parseInt(args[0]);
	  Function(num);
	}
}
