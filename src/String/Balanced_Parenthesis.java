package String;

import java.util.Stack;

public class Balanced_Parenthesis {
	/* Balanced Parentheses Problem
	 *🔑 Problem Statement
	 *Given an expression string consisting of parentheses/brackets/braces → (), {}, [],check if the parentheses are balanced.
	 *✅ Balanced means:
	 *Every opening bracket has a closing bracket of the same type.
	 *Brackets close in the correct order.
	 *Example:
	 *Input: "([{}])" → Balanced
	 *Input: "([)]" → Not Balanced
	 *✅ Algorithm (Using Stack)
	 *1. Create an empty stack.
	 *2. Traverse the string character by character.
	 *If the character is an opening bracket ((, {, [), push it onto the stack.
	 *If it is a closing bracket (), }, ]):
	 *Check if the stack is empty → if yes, return Not Balanced.
	 *Otherwise pop the top element and check if it matches the correct type.
	 *) should match (
	 *} should match {
	 *] should match [
	 *If not matching → return Not Balanced.
	 *3. After traversing the string:
	 *If the stack is empty → Balanced.
	 *Else → Not Balanced.
*/
public static void main(String[] args) {
    String expr1 = "([{}])";
    String expr2 = "([)]";
    String expr3 = "((()))";

    System.out.println(expr1 + " -> " + isBalanced(expr1));
    System.out.println(expr2 + " -> " + isBalanced(expr2));
    System.out.println(expr3 + " -> " + isBalanced(expr3));
}
    // Function to check balanced parentheses
    public static boolean isBalanced(String expr) 
    {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expr.length(); i++) 
        {
            char ch = expr.charAt(i);

            // Push opening brackets
            if (ch == '(' || ch == '{' || ch == '[')
            {
                stack.push(ch);
            } 
            // Closing brackets
            else if (ch == ')' || ch == '}' || ch == ']') 
            {
                // If stack empty -> not balanced
                if (stack.isEmpty()) 
                {
                    return false;
                }

                char top = stack.pop();

                // Check matching pair
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) 
                {
                    return false;
                }
            }
        }

        // Final check
        return stack.isEmpty();
    }
}

