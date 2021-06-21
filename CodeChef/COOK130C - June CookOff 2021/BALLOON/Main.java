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
        int numTests = sc.nextInt();
        for(int i=0; i<numTests; i++) {
            int n = sc.nextInt();
            int count = 7;
            int ans = 0;
            for(int j=0; j<n; j++) {
                int x = sc.nextInt();
                if(count > 0) {
                    ans++;
                }
                if(x <= 7) {
                    count--;
                }
            }
            System.out.println(ans);
        }
	}
}
