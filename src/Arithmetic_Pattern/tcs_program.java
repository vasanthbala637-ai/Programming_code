package Arithmetic_Pattern;

public class tcs_program 
{
    public static void main(String[] args) 
    {
        String str = "1";  // First line
        int lines = 5;     // Total number of lines to print

        for (int i = 1; i <= lines; i++) 
        {
            System.out.println(str);  // Print current line

            String next = "";         // To build next line
            int count = 1;            // Count of same digits
            char ch = str.charAt(0);  // First character

            for (int j = 1; j < str.length(); j++) 
            {
            	
            	
                if (str.charAt(j) == ch)
                {
                    count++;  // Same character
                } 
                else
                {
                    next = next + count + ch;  // Add count and character to next line
                    ch = str.charAt(j);        // Move to new character
                    count = 1;
                }
            }

            // Add the last group
            next = next + count + ch;
            str = next;  // Set next line as current for next loop
        }
    }
}