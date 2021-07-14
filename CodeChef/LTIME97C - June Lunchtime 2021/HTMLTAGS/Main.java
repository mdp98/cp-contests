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
        Integer testcases = Integer.parseInt(sc.nextLine());
        for(int i=0; i<testcases; i++) {
            String str = sc.nextLine();
            if(str.length() < 4) {
                System.out.println("Error");
                continue;
            }
            System.out.println((int)str.charAt(0) + " " + (int)str.charAt(str.length()-1));
            if(str.charAt(0) == '<' && str.charAt(1) == '/' && str.charAt(str.length()-1) == '>') {
                int index = 2;
                boolean isCorrect = true;
                while(index < str.length()-1) {
                    if(str.charAt(index) >= 'a' && str.charAt(index) <= 'z') {
                        index++;
                        continue;
                    } else if (str.charAt(index) >= '0' && str.charAt(index) <= '9') {
                        index++;
                        continue;
                    } else {
                        isCorrect = false;
                        break;
                    }
                }
                if(isCorrect) {
                    System.out.println("Success");
                } else {
                    System.out.println("Error");
                }
            } else {
                System.out.println("Error");
            }
        }
	}
}
