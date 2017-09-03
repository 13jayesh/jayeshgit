/******************************************************************************
 *  Compilation:  javac -d bin threenames.java
 *  Execution:    java -cp bin com.threenames.util.PrimeChecker n
 *  
 *  Purpose: cheack either it is anagram or not.
 *
 *  @author  jayesh patil
 *  @version 1.0
 *  @since   11-08-2017
 *
 ******************************************************************************/
/******************************************************************************
 *  Compilation:  javac -d bin threenames.java
 *  Execution:    java -cp bin com.threenames.util.PrimeChecker n
 *  
 *  Purpose: cheack either it is anagram or not.
 *
 *  @author  jayesh patil
 *  @version 1.0
 *  @since   11-08-2017
 *
 ******************************************************************************/
//package com.bridgelabz.util;

 public class StringFunction
 {
public static void string(String name1, String name2) {
int nameFirst=name1.length();
int nameSecond=name2.length();
int found = 0;
if(nameFirst == nameSecond) {
for(int i=0;i<nameFirst;i++) {
for(int j=0;j<nameSecond;j++) {
	if(name1.charAt(i) == name2.charAt(j))// char is cheack charector
	{
		found = 1;
		break;
	}
}
}	
}
if(found == 1)
{
System.out.println("anagram"); 
}
else 
	System.out.println("Mot anagram");       
}

public static void main(String args[])
{
String name1=args[0];
String name2=args[1];
string(name1,name2);
}
}