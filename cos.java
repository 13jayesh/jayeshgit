/********************************************************************************
 * Purpose:  Compute cos x using the Taylor series expansions
 *
 * @author:  jayesh patil
 * @version: V1.0
 * @since:   7-8-2017
 *********************************************************************************/

//package com.bridgelabz.util;

public class Cos {
    //Recursive function to find factorial
    public static int factorial(int angleX){
        if(angleX == 1)
            return 1;
        else
            return angleX = angleX*factorial(angleX - 1);
    }
    public static void main(String args[]){
        double angleX = Integer.parseInt(args[0]);
        int copyOfAngleX = (int)angleX;
        angleX = angleX % (2 * Math.PI);      // Convert angle x to an angle between -2 PI and 2 PI
        //Taylor series expansion for cos x
        double cosvalue = 1 - Math.pow(angleX,2) / factorial(2) + Math.pow(angleX,4) / factorial(4)
                          - Math.pow(angleX,6) / factorial(6);
        System.out.println("Cos " + copyOfAngleX + " = " + cosvalue);
    }
}
