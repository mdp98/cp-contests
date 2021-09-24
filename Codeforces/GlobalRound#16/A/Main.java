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
        for(int i=0; i<testcases; i++) {
            int n = sc.nextInt();
            int sum = sc.nextInt();
            
            int median = n/2;
            if(n%2 != 0) {
                median++;
            }
            int ans = sum / (n - median + 1);
            System.out.println(ans);
        }
	}
}