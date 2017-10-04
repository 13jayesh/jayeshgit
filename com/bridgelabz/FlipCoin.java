
/********************************************************************************
 * Purpose: Flip Coin and print percentage of Heads and Tails
 * @author:  jayesh patil
 * @version: V1.0
 * @since:   7-8-2017
 *********************************************************************************/public class FlipCoin 
{
   
public static void main(String args[])
	{
	    float flip=0;
	    float Count0=0;
            float Count1=0;
		for(int i=0;i=<10;i++)
                
		{       
			if(Math.random()>= 0.5)
			{
			System.out.println("Head");
			Count0++;
        		}
			else
            		{
			System.out.println(" Tail");
                	Count1++;
			}
		flip++;
			
		}
		System.out.println(Count0);
		System.out.println(Count1);	
		System.out.println(flip);
		float s=(Count0/flip)*100;
                float s1=(Count1/flip)*100;
		System.out.println("avg of head"+s);
		System.out.println("avg of tails"+s1);
}
}
