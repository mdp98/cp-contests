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
            int n = sc.nextInt();
            int p = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int ans = 0;
            for(int i=0; i<n; i++) {
                int type = sc.nextInt();
                if(i >= p) {
                    continue;
                }
                if(type == 0) {
                    ans += x;
                } else {
                    ans += y;
                }
            }
            System.out.println(ans);
        }
	}
}
