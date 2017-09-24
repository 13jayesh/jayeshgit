/******************************************************************************
 *  Compilation:  javac -d bin threenames.java
 *  Execution:    java -cp bin com.threenames.util.PrimeChecker n
 *  
 *  Purpose: findout the formuia for future value.
 *
 *  @author  jayesh patil
 *  @version 1.0
 *  @since   11-08-2017
 *
 ****************************************************************/
 public class MathFunction

{   //method to find the future value
	public static void fu(double i,double c,double R,double t)
	
	{
	double faturevalue= c*(Math.pow(1+R,t));
	System.out.println("present value is"+faturevalue);
	}
	
	
	public static void main(String args[])
	{
	double i= Double.parseDouble(args[0]);
	double c= Double.parseDouble(args[1]);
	double R=Double.parseDouble(args[2]);
     double t= Double.parseDouble(args[3]);	
	fu(i,c,R,t);
	}
	}