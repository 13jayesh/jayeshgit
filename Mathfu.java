/********************************************************************************
 * Purpose: To find out sin & cos functions & also harmonic series using method
 *
 * @author:  jayesh patil
 * @version: V1.0
 * @since:   7-8-2017
 *********************************************************************************//
import java.lang.Math;
public class Mathfu
   public static void cos(double AngleX){
      
   double copyOfAngleX = (double)AngleX;
    AngleX = AngleX%(2 * 3.14);      // Convert angle x to an angle between -2 PI and 2 PI
        //Taylor series expansion for sin x
    double sinvalue = AngleX - Math.pow(AngleX,3.0) / factorial(3.0) + Math.pow(AngleX,5.0) / factorial(5.0)
                        - Math.pow(AngleX,7.0) / factorial(7.0);
    System.out.println("Sin " + copyOfAngleX + " = " + sinvalue);
    } 


    //Recursive function to find factorial
    public static double factorial(double angleX)
	{
        if(angleX == 1)
            return 1;
        else
            return angleX = angleX*factorial(angleX - 1);
    }
    public static void sin(double angleX){
    double copyOfAngleX = (double)angleX;
    angleX = angleX % (2 * 3.14);      // Convert angle x to an angle between -2 PI and 2 PI
        //Taylor series expansion for cos x
     double cosvalue = 1 - Math.pow(angleX,2) / factorial(2) + Math.pow(angleX,4) / factorial(4)
                          - Math.pow(angleX,6) / factorial(6);
     System.out.println("Cos " + copyOfAngleX + " = " + cosvalue);
    }


    public static void har( double n){
    double harmonic = 0;
       for(double i = 1;i <= n;i++)
       harmonic = harmonic + (1 / i);
       System.out.println(harmonic);
    }
public static void main(String args[])
{
 //double AngleX = ;
 //double angleX = ;
 //int n = ;
  cos(Double.parseDouble(args[0]));
  sin(Double.parseDouble(args[1]));
  har(Double.parseDouble(args[2]));
 }}