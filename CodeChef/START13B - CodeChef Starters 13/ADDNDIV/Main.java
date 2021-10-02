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
        for(int k=0; k<numTests; k++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            boolean ans = true;
            if(a%2 == 0) {
                if(b%2 != 0) {
                    System.out.println("NO");
                    continue;
                }
                while(b%2 == 0) {
                    b = b/2;
                }
                while(a%2 == 0) {
                    a = a/2;
                }
            }
            for(int i=3; i<=Math.sqrt(a); i=i+2) {
                if(a%i == 0) {
                    if(b%i != 0) {
                        ans = false;
                        break;
                    }
                    while(a%i == 0 ) {
                        a = a/i;
                    }
                    while(b%i == 0) {
                        b = b/i;
                    }
                }
            }
            if(!ans) {
                System.out.println("NO");
                continue;
            }
            if(a > 2) {
                if(b%a != 0) {
                    System.out.println("NO");
                    continue;
                }
            }
            System.out.println("YES");
        }
	}
}
