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
            int l = sc.nextInt();
            int h = sc.nextInt();
            String dump = sc.nextLine();
            String str = sc.nextLine();
            int index = 0;
            boolean isEnough = false;
            ArrayList<Integer> freeTime = new ArrayList<Integer>();
            while(index < l) {
                while(index < l && str.charAt(index) == '1') {
                    index++;
                }
                int count = 0;
                while(index < l && str.charAt(index) == '0') {
                    count++;
                    index++;
                }
                freeTime.add(count);
            }
            for(int j=0; j<freeTime.size(); j++) {
                if(freeTime.get(j) >= h) {
                    isEnough = true;
                    break;
                }
                if(freeTime.get(j) > h/2) {
                    h = 2*(h-freeTime.get(j));
                }
            }
            if(isEnough) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
	}
}
