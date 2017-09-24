/******************************************************************************
 *  Compilation:  javac -d bin threenames.java
 *  Execution:    java -cp bin com.threenames.util.PrimeChecker n
 *  
 *  Purpose: Find the min & max values.
 *
 *  @author  jayesh patil
 *  @version 1.0
 *  @since   11-08-2017
 *
 ****************************************************************/public class Minmax
{
// method to find the min &  max number
public static void fo(int a[])
{
int max=a[0],min=a[0];
int i;
for( i=1;i<a.length;i++)
{
if(max<a[i])
max=a[i]; // max value
if(min>a[i])
    min=a[i]; // min value
}
System.out.println(max+""+min);
}

public static void main(String args[])
{
int a[]={1,3,5,3,8,6}; //predefine arry

fo(a);

}
}