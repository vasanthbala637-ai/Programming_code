package Switch_case;
public class program3 
{
	public static void main(String[] args)
	{
		 int a=10;
		switch(a+a+a)
		{
		case 11: System.out.println("11");
		 		break;
		case 10: System.out.println("10");
 				break;
		case 12: System.out.println("12");
 				break;
		case 10+12: System.out.println(10+12);
			break;
		case 30: System.out.println(30);
				break;
 		default: System.out.println("invalid");
 				break;
		}
		System.out.println("a = "+a);
	}
}
