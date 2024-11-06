package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_11047 {
   	static int sum;
    
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
	    
	 	int N = Integer.parseInt(st.nextToken());
    	int K = Integer.parseInt(st.nextToken());
    	int[] arr = new int[N];
    	
    	for(int i=0; i<N; i++) {
    		st = new StringTokenizer(br.readLine());
       		arr[i] = Integer.parseInt(st.nextToken());
    	}
    	
    	for(int j=N-1; j>=0; j--) {
    		sum += K/arr[j];   		
    		K %= arr[j];
    	}
    	
    	System.out.println(sum);    	
	}
}