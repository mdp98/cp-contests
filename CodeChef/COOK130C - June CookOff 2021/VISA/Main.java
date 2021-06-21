/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CodeChef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
		    int x1 = sc.nextInt();
		    int x2 = sc.nextInt();
		    int y1 = sc.nextInt();
		    int y2 = sc.nextInt();
		    int z1 = sc.nextInt();
		    int z2 = sc.nextInt();
		    getVerdict(x1, x2, y1, y2, z1, z2);
		}
	}
	
	public static void getVerdict(int x1, int x2, int y1, int y2, int z1, int z2) {
	    if(x2 < x1) {
	        System.out.println("NO");
	        return;
	    }
	    if(y2 < y1) {
	        System.out.println("NO");
	        return;
	    }
	    if(z1 < z2) {
	        System.out.println("NO");
	        return;
	    }
	    System.out.println("YES");
	    return;
	}
}
