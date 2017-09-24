/********************************************************************************
 * Purpose:  Compute sin x using the Taylor series expansions
 *
 * @author:  jayesh patil
 * @version: V1.0
 * @since:   7-8-2017
 *********************************************************************************/

//package com.bridgelabz.util;

      public class Sin
	  {
    //Recursive function to find factorial
    public static int factorial(int angleX){
        if(angleX == 1)
            return 1;
        else
            return angleX=angleX*factorial(angleX - 1);
    }
    public static void main(String args[]){
        double angleX = Integer.parseInt(args[0]);
        int copyOfAngleX = (int)angleX;
        angleX = angleX%(2 * Math.PI);      // Convert angle x to an angle between -2 PI and 2 PI
        //Taylor series expansion for sin x
        double sinvalue = angleX - Math.pow(angleX,3) / factorial(3) + Math.pow(angleX,5) / factorial(5)
                        - Math.pow(angleX,7) / factorial(7);
        System.out.println("Sin " + copyOfAngleX + " = " + sinvalue);
    }
}
