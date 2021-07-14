import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception {
		// your code goes here
		Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        for(int i=0; i<testcases; i++) {
            int n = sc.nextInt();
            int odd = 0;
            int even = 0;
            for(int j=0; j<2*n; j++) {
                int x = sc.nextInt();
                if(x%2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
            if(even == odd) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
