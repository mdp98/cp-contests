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
            solve(n);
        }
    }

    public static void solve(int n) {
        List<Integer> ans = new ArrayList<>();
        if(n%2 == 0) {
            for(int i=0; i<n; i=i+2) {
                System.out.print((i+2) + " ");
                System.out.print((i+1) + " ");
            }
        } else {
            for(int i=0; i<n-3; i=i+2) {
                System.out.print((i+2) + " ");
                System.out.print((i+1) + " ");
            }
            System.out.print((n) + " ");
            System.out.print((n-2) + " ");
            System.out.print((n-1) + " ");
        }
        System.out.println();
    }
}
