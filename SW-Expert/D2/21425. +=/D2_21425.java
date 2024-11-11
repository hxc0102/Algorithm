package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D2_21425{	
	static int N, a, b, c, count;
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	N = Integer.parseInt(st.nextToken());
    	
    	for(int i = 0; i < N; i++) {
    		count = 0;
    		st =new StringTokenizer(br.readLine());
        	a = Integer.parseInt(st.nextToken());
        	b = Integer.parseInt(st.nextToken());
        	c = Integer.parseInt(st.nextToken());    
        	
        	
        	
         	do {
         		if( a > b) {
            		int temp = a;
            		a = b;
            		b = temp;
            		
            	}
    			count++;
    			a += b;
    	        } while (a <=  c);
        	
        	System.out.println(count);
        	
    	}
    	
    	
    	}
}
