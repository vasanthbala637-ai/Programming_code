/*Write A Java Program to create method to find out gst & cgst?
formula

GST-> (price gstRate)/100
CGST-> (price ogstRate)/100
SGST-> (price sgstRate)/100
note:
gstrate= gstRate/2
sgstRate= gstRate/2 */
package Method_Program;

import java.util.Scanner;

public class Logic_program_1 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.print("ENTER THE  SELLING PRICE : ");
		double selling=scn.nextDouble();
		Logic_program_1 lp1 = new Logic_program_1();
		System.out.print("GST AMOUNT IS : ");
		double gstAmount=lp1.gst(selling);
		System.out.println(gstAmount);
		System.out.println("------------------------------------");
		System.out.print("CGST AMOUNT IS : ");
		System.out.println(lp1.cgst(selling));
		System.out.println("------------------------------------");
		System.out.print("SGST AMOUNT IS : ");
		System.out.println(lp1.sgst(selling));
		System.out.println("------------------------------------");
		System.out.print("TOTAL AMOUNT IS : ");
		System.out.println(lp1.Totalprice(selling,gstAmount));
	}
	public double gst(double selling)
	{
		double gstAmount=(selling*18)/100;
		return gstAmount;
	}
	public double cgst(double selling)
	{
		double cgstAmount=(selling*9)/100;
		return cgstAmount;
	}
	public double sgst(double selling)
	{
		double scgstAmount=(selling*9)/100;
		return scgstAmount;
	}
	public double Totalprice(double selling,double gstAmount)
	{
		double Total = selling + gstAmount;
		return Total;
	}
}
