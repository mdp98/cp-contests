/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CanReach
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int numTests = sc.nextInt();
        for(int i=0; i<numTests; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int k = sc.nextInt();
            if(x%k == 0 && y%k == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
	}
}
