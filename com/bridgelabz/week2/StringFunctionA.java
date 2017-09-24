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

 public class StringFunctionA
 {
public static void string(String name1, String name2) {
int nameFirst=name1.length();
int nameSecond=name2.length();
int count = 0;
if(nameFirst == nameSecond) {
for(int i=0;i<nameFirst;i++) {
for(int j=0;j<nameFirst;j++) {
	if(name1.charAt(i) == name2.charAt(j))// char is cheack charector
	{
		count++;
		break;
	}
}
}	
}
if(count == nameSecond)
{
System.out.println("anagram"); 
}
else 
	System.out.println("Mot anagram");       
}
public static String lowercase(String name1)
{
String s2="";String s3="";   
int achar=0,i;
for(i=0;i< name1.length();i++)
{
 achar=(int)name1.charAt(i);
 if(achar >=65 && achar <=90) {
  s3=Character.toString((char)((achar +32)));
s2=s2+s3;
} else {
s3=Character.toString((char)((achar)));
s2=s2+s3;

}
}
System.out.println(s2);
  return s2;
}   
public static void main(String args[])
{
String name1=args[0];
String name2=args[1];
 name1=lowercase(name1);
  name2=lowercase(name2);
string(name1,name2);

}
}
