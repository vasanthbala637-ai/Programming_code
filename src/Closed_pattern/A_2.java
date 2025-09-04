package Closed_pattern;
public class A_2 
{
	public static void main(String[] args) 
	{
        for (int i = 1; i <= 4; i++)
        {
            for (int j = i; j < 4; j++)
            {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) 
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= 3; i++) 
        {
            for (int k = 1; k <= i; k++) 
            {
                System.out.print("  ");
            }
            for (int j = 3; j >= i; j--) 
            {
                System.out.print("* ");
            }
            System.out.println();
        }
	}
}
