/* Write A Java Program to create an method to generate electricity bill by considering below cases

1) for first 50 units Rs 0.50/unit
2) for first 150 units Rs 0.75/unit
3) for first 250 units Rs 1.20/unit
4) for above 250 units Rs 1.50/unit
notes : an additional surcharge will be 25% is added to the bill ?
formula:
1) amount =unit*price;
2) surcharge= amount *(25/100)
3) bill= amount + surcharge */
package Method_Program;

import java.util.Scanner;

public class Logic_Program_2 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.print(" ENTER YOUR UNIT : ");
		double unit=scn.nextDouble();
		Logic_Program_2 lp2=new Logic_Program_2();
		lp2.bill(unit);
	}
	public void bill(double unit)
		{
		double amount;
			if(unit<=50)
			{
				amount=unit*0.50;
			}
			else if(unit>50 && unit<=150)
			{
				amount=unit*0.75;
			}
			else if (unit>150 && unit<=250) 
			{
				amount=unit*1.20;
			}
			else
			{
				amount=unit*1.50;
			}
			System.out.println("------------------------------------");
			System.out.println("AMOUNT PER UNIT : "+amount);
			double surcharge=amount*(25/10);
			System.out.println("------------------------------------");
			System.out.println("SURCHARGE AMOUNT IS : "+surcharge);
			double bill=amount + surcharge;
			System.out.println("------------------------------------");
			System.out.println("TOTAL ELECTRICITY AMOUNT IS : "+bill);
		}
	}
