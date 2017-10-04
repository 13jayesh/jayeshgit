
/********************************************************************************
 * Purpose: Flip Coin and print percentage of Heads and Tails
 * @author:  jayesh patil
 * @version: V1.0
 * @since:   7-8-2017
 *********************************************************************************/import java.util.Scanner;
public class Distance
{
public static void Function(int x,int y)
{
double distance = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));

System.out.println("ecludian distance is"+distance);

}



public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter number");
int x=sc.nextInt();  
System.out.println("Enter number");
int y=sc.nextInt();
Function(x,y);
}
}
