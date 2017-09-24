/******************************************************************************
 *  Compilation:  javac -d bin threenames.java
 *  Execution:    java -cp bin com.threenames.util.PrimeChecker n
 *  
 *  Purpose: findout the PrimeNoInRange.
 *
 *  @author  jayesh patil
 *  @version 1.0
 *  @since   11-08-2017
 *
 ****************************************************************/
 public class PrimeNoInRange 
{
    public static void fo( int a, int b)
	{
/* use for loop for findout the prime number beween perticuler number*/
        for(int i=a;i<=b;i++)
		{
            count=0;
            for(int j=2;j<=i/2;j++){
                if(i%j==0)
                count++;/*if the number not prime then couter is increase*/
            }
            if(count==0&&i!=0&&i!=1)/* if counter is equal to 0 then its prime number*/
			{
                System.out.println(i+" ");
            }
        }
    }
 public static void main(String args[])
	{
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int count;
        fo(a,b);
}
}