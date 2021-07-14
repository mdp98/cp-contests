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
            int n = sc.nextInt();
            String dump = sc.nextLine();
            HashMap<String, Integer> hm = new HashMap<String, Integer>();
            for(int j=0; j<3*n; j++) {
                String str = sc.nextLine();
                String[] arr = str.split(" ");
                if(hm.contains(arr[0])) {
                    hm.put(arr[0], hm.get(arr[0]) + Integer.parseInt(arr[1]));
                } else {
                    hm.put(arr[0], Integer.parseInt(arr[1]));
                }
            }
            PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
            Iterator itr = hm.keySet().iterator();
            while(itr.hasNext()) {
                pq.add(hm.get(itr.next()));
            }
            while(!pq.isEmpty()) {
                System.out.print(pq.poll() + " ");
            }
            System.out.println();
        }
	}
}
