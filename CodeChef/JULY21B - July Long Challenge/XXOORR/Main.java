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
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    int[] arr = new int[n];
		    for(int j=0; j<n; j++) {
		        arr[j] = sc.nextInt();
		    }
            int ans = 0;
		    while(!isDone(arr)) {
                int ones = 0;
                for(int j=0; j<arr.length; j++) {
                    if(arr[j]%2 == 1) {
                        ones++;
                    }
                    arr[j] = arr[j]/2;
                }
                if(ones % k != 0) {
                    ans += 1;
                }
                ans += (ones/k);
            }
            System.out.println(ans);
		}
	}
	
	public static boolean isDone(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
