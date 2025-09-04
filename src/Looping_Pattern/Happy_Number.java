package Looping_Pattern;

public class Happy_Number 
{
	public static void main(String[] args) 
	{
		int num = 120;
        int copy = num;
        int rem=0;
        while (copy != 1 && copy!=4) 
        {
            int sum = 0;
            while (copy > 0) 
            {
                rem = copy % 10;
                sum = sum + (rem * rem);
                copy = copy / 10;
            }
            copy = sum;
        }
      if(copy==1)
      {
    	  System.out.println(num+" is Happy Number");
      }
      else
      {
    	  System.out.println(num+" is Not Happy Number");
      }
	}
}
