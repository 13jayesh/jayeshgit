/********************************************************************************
 * Purpose: taking a, b and c as input values and print the following integer
 *          operations a + b *c, a * b + c, c + a / b, and a % b + c.
 *
 * @author:  jayesh patil
 * @version: V1.0
 * @since:   7-8-2017
 *********************************************************************************/

//package com.bridgelabz.util;

public class IntOpt {
    public static void main(String args[]){
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        double ans;

        ans = a + b * c;
        System.out.println(a + "+" + b + "*" + c + " = " + ans);

        ans = a * b + c;
        System.out.println(a + "*" + b + "+" + c + " = " + ans);

        ans = c + ( a/ b);
        System.out.println(c + "+" + a + "/" + b + " = " + ans);

        ans = a % b + c;
        System.out.println(a + "%" + b + "+" + c + " = " + ans);
    }
}