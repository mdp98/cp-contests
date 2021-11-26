/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Submimx
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int numTests = sc.nextInt();
        for(int i=0; i<numTests; i++) {
            long n = sc.nextLong();
            long m = sc.nextLong();
            long ans = 0;
            if(n-m < m+1) {
                System.out.println(n-m);
                continue;
            }
            long min = (n-m)/(m+1);
            long rem = (n-m)%(m+1);
            ans = (m + 1 - rem)*countSubstrings(min)  + (rem)*countSubstrings(min+1);
            System.out.println(ans);
        }
	}

    public static long countSubstrings(long n) {
        return ((n)*(n+1))/2;
    }
}