package com.bridgelabz.util;
import java.util.Scanner;
import java.util.Random;
public class TicTac
	{

public static void main(String args[])
	{
	

	System.out.println("welcome to tic tac game");
	Scanner sc=new Scanner(System.in);
	
	
	int row,coloum;
		if(Math.random()>0.5)
		{
		System.out.println("user is 1st");
		User(A);
		}
		else
		{
		System.out.println("compature is 1st");
		computer(A);
		

		}

	}

	public static char A[][]=new char[3][3];        
	public static char  user ='x';
	public static char computer = 'o';
	public static void User(char A[][])
		{	
			Scanner sc=new Scanner(System.in);
			int row=sc.nextInt();
			int coloum=sc.nextInt();
			if(A[row][coloum] !='x' || A[row][coloum] !='o')
			{
				A[row][coloum]='x';
				System.out.println("A["+row+"]["+coloum+"]"+user);
				if(userwin(A))
				{
				System.out.println("user win");	
				}
				else
					computer(A);
			}
			else
				User(A);

		}

	public static void computer(char A[][])
		{			
			int row=(int) (Math.random()*3);
					
			int coloum=(int)(Math.random()*3);
			if(A[row][coloum] !='x' || A[row][coloum] !='o')
			{
				A[row][coloum]='x';
				System.out.println("A["+row+"]["+coloum+"]"+computer);
				if(computerwin(A))
				{
				System.out.println("computer win");
				}
				else
					User(A);
			}
			else
				computer(A);
		}

	public static boolean computerwin(char A[][])
		{
		if(A[0][0]=='o' && A[0][1]=='o' && A[0][2]=='o' ||
		   A[0][0]=='o' && A[1][0]=='o' && A[2][0]=='o' ||
		   A[0][2]=='o' && A[1][2]=='o' && A[2][2]=='o' ||
		   A[2][0]=='o' && A[2][1]=='o' && A[2][2]=='o' ||
		   A[0][0]=='o' && A[1][1]=='o' && A[2][2]=='o' ||
		   A[0][2]=='o' && A[1][2]=='o' && A[2][0]=='o')
			{
			return true;
			}
		else
			return false;
	}		

	public static boolean userwin(char A[][])
		  {
		 if(A[0][0]=='x' && A[0][1]=='x' && A[0][2]=='x' ||
		    A[0][0]=='x' && A[1][0]=='x' && A[2][0]=='x' ||
		    A[0][2]=='x' && A[1][2]=='x' && A[2][2]=='x' ||
		    A[2][0]=='x' && A[2][1]=='x' && A[2][2]=='x' ||
		    A[0][0]=='x' && A[1][1]=='x' && A[2][2]=='x' ||
		    A[0][2]=='x' && A[1][2]=='x' &&A[2][0]=='x') 
			{
			return true;
			}
		else
			{
			
			return false;			
			}

		}





	
}

