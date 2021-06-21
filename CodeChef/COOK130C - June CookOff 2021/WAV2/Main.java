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
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] roots = new int[n];
        for(int i=0; i<n; i++) {
            roots[i] = sc.nextInt();
        }
        Arrays.sort(roots);
        for(int i=0; i<q; i++) {
            int x = sc.nextInt();
            boolean zero = false;
            int low = 0;
            int high = n-1;
            while(low < high) {
                int mid = (low + high) / 2;
                if(roots[mid] == x) {
                    zero = true;
                    break;
                } else if (roots[mid] > x) {
                    high = mid-1;
                } else {
                    low = mid+1;
                }
            }
            if(zero || roots[low] == x) {
                System.out.println("0");
                continue;
            }
            int neg = n;
            if(roots[low] > x) {
                neg = neg - low;
                
            } else {
                neg = neg - low - 1;
            }
            if(neg%2 == 0) {
                System.out.println("POSITIVE");
            } else {
                System.out.println("NEGATIVE");
            }
        }
	}
}
