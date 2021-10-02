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
        String buffer = sc.nextLine();
        for(int j=0; j<numTests; j++) {
            String doors = sc.nextLine();
            int ans = 0;
            for(int i=0; i<doors.length(); i++) {
                if(doors.charAt(i) == '1') {
                    if(ans%2 != 0) {
                        ans++;
                    }
                } else {
                    if(ans % 2 == 0) {
                        ans++;
                    }
                }
            }
            System.out.println(ans);
        }
	}
}
