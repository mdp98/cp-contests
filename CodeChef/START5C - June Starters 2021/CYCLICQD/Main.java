/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        for(int i=0; i<testcases; i++) {
            int a = 0;
            int b = 0;
            for(int j=0; j<2; j++) {
                a += sc.nextInt();
                b += sc.nextInt();
            }
            if(a == 180 && b == 180) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
	}
}
