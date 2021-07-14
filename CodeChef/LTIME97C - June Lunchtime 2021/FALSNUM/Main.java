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
        String dump = sc.nextLine();
        for(int i=0; i<testcases; i++) {
            String number = sc.nextLine();
            if(number.charAt(0) == '1') {
                System.out.println(number.substring(0,1) + "0" + number.substring(1, number.length()));
            } else {
                System.out.println("1" + number);
            }
        }
	}
}
