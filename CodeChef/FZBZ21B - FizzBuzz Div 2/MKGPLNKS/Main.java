/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class MagicPlanks
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int numTests = sc.nextInt();
        for(int i=0; i<numTests; i++) {
            int len = sc.nextInt();
            String buffer = sc.nextLine();
            String planks = sc.nextLine();
            int w = 0;
            int b = 0;
            char curr = 'X';
            int pointer = 0;
            while(pointer < len) {
                while(pointer < len && planks.charAt(pointer) == curr) {
                    pointer++;
                }
                if(pointer < len) {
                    curr = planks.charAt(pointer);
                    if(curr == 'W') {
                        w++;
                    } else {
                        b++;
                    }
                }
                pointer++;
            }
            System.out.println(Math.min(w,b));
        }
	}
}
