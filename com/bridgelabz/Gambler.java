/********************************************************************************
 * Purpose: Smulate a gambler where he starts with certain stake in INR and
 *          places fair Re 1 bet until he/she goes broke or reaches the goal set
 *          as input. Keeps track of the number of times won and number of
 *          bets made. Run the simulation N times.
 *
 * @author:  jayesh patil
 * @version: V1.0
 * @since:   7-8-2017
 *********************************************************************************

package com.bridgelabz.util;***/
public class Gambler
{
public static void Function(int bet,int goal,int trial)
{
double i,cash=0.6;
while(cash>0 && cash>goal)
{
for(i=0;i<=trial;i++)
{
bet++;
if(Math.random()>0.5)
{
cash++;

}
else
{
cash--;
}
}
if(cash==goal)
{
System.out.println("you win");
}
}
}
public static void main(String args[])
{

int bet=Integer.parseInt(args[0]);
int goal=Integer.parseInt(args[0]);
int trial=Integer.parseInt(args[0]);
Function(bet,goal,trial);
}
}
