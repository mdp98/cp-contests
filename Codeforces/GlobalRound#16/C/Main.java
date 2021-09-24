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
            int cols = sc.nextInt();
            String dummy = sc.nextLine();
            String a = sc.nextLine();
            String b = sc.nextLine();

            int ans = 0;
            int pointer = 0;
            while(pointer < cols) {
                if(sum(a.charAt(pointer), b.charAt(pointer)) == 1) {
                    ans += 2;
                    pointer++;
                    continue;
                } else if(sum(a.charAt(pointer), b.charAt(pointer)) == 0) {
                    if(pointer == cols - 1) {
                        ans++;
                        pointer++;
                        continue;
                    } else {
                        if(sum(a.charAt(pointer+1), b.charAt(pointer+1)) == 2) {
                            ans += 2;
                            pointer += 2;
                            continue;
                        } else {
                            ans++;
                            pointer++;
                            continue;
                        }
                    }
                } else {
                    if(pointer == cols - 1) {
                        pointer++;
                        continue;
                    } else {
                        if(sum(a.charAt(pointer+1), b.charAt(pointer+1)) == 0) {
                            ans += 2;
                            pointer += 2;
                            continue;
                        } else {
                            pointer++;
                            continue;
                        }
                    }
                }
            }
            System.out.println(ans);
        }        
	}

    public static int sum(char a, char b) {
        return a + b - '0' - '0';
    }
}