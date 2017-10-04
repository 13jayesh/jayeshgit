/********************************************************************************
 * Purpose: takes a range of number as input and outputs the Prime Numbers
 *          in that range.
 *
 * @author:  jayesh patil
 * @version: V1.0
 * @since:   7-8-2017
 *********************************************************************************/
public class Primefact
{
public static void function(int num)
{
int i;
for (i=2;i*i<=num;i++)
{
if(num%i !=0)
{
int s=num%i;
if(s%i !=0)
System.out.println(s);
}
}
}



public static void main(String args[])
{
int num=Integer.parseInt(args[0]);
function(num);
}
}
