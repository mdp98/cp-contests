/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int numTests = sc.nextInt();
        for(int j=0; j<numTests; j++) {
            long total = sc.nextInt();
            long a = sc.nextInt();
            long b = sc.nextInt();
            long c = sc.nextInt();
            long x = sc.nextInt();
            long y = sc.nextInt();
            long min = Math.min(a*x + b, a*y + c);
            System.out.println(total/min);
        }
	}
}
