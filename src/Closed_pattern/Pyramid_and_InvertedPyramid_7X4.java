package Closed_pattern;

public class Pyramid_and_InvertedPyramid_7X4 
{
	public static void main(String[] args)
	{
		 // Inverted Pyramid (Top Half)
        for (int i = 1; i <= 4; i++) {
            // Leading spaces
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }

            // Stars
            for (int k = i; k <= 4; k++) {
                System.out.print("* ");
            }
            for (int l = i + 1; l <= 4; l++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // Pyramid (Bottom Half)
        for (int i = 1; i <= 4; i++) {
            // Leading spaces
            for (int j = 3; j >= i; j--) {
                System.out.print("  ");
            }

            // Stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            for (int m = 2; m <= i; m++) {
                System.out.print("* ");
            }

            System.out.println();
        }
		}
	}

