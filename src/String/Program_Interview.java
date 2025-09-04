package String;

public class Program_Interview 
{
	public static void main(String[] args) 
	{
		String input = "swiss";

        for (int i = 0; i < input.length(); i++) 
        {
            char c = input.charAt(i);
            int count = 0;

            for (int j = 0; j < input.length(); j++) 
            {
                char a = input.charAt(j);
                if (c == a) 
                {
                    count++;
                }
            }

            if (count == 1) 
            {
                System.out.println(c);
                i = input.length(); // stop loop after first non-repeating char
            }
        }
	}
}
