/******************************************************************************
 *  Compilation:  javac -d bin threenames.java
 *  Execution:    java -cp bin com.threenames.util.PrimeChecker n
 *  
 *  Purpose: Find the word is palindrome or not.
 *
 *  @author  jayesh patil
 *  @version 1.0
 *  @since   11-08-2017
 *
 ****************************************************************/
 public class pal
{
//method fo is call to cheack whether it is palindrome or not.*/
public static void fo (String s)
{
	int j;

char []p=s.toCharArray(); //convert to character array
int s1=s.length();        //find length of  char
System.out.println(s1);
char []new1=new char[s1];
j=0;
for( int i=s1-1;i>=0;i--)
{
new1[j]=p[i];
j++;
}
int count=0;
for(int i=0;i<s1;i++)
	{
	if(p[i]==new1[i])
		{
		count++;
		}
	}
	System.out.println(count);
if(count==s1)
	System.out.println("palindrome");
else
	System.out.println("not palindrome");



}
public static void main (String args[])
{
String s=args[0];
fo(s);
}
}