import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        String dummy = sc.nextLine();
        for(int i=0; i<testcases; i++) {
            String str = sc.nextLine();
            int ans = 2;
            int pointer = 0;
            int count = 0;
            while(pointer < str.length()) {
                if(str.charAt(pointer) == '1') {
                    pointer++;
                    continue;
                } else {
                    count++;
                    pointer++;
                    while(pointer < str.length() && str.charAt(pointer) == '0') {
                        pointer++;
                    }
                }
                if(count > ans) {
                    break;
                }
            }
            System.out.println(Math.min(ans, count));
        }
	}
}