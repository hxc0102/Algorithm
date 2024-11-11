package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D2_1859 {
	static int T, N;
	static int[] arr;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		T = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			arr = new int[N];
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<N; j++) {
				arr[j] = Integer.parseInt(st.nextToken());	
			}
			
			long result = 0;
			int max = 0;
			
			for(int k=N-1; k>=0; k--) {
				if(arr[k] > max) max = arr[k];
				result += max - arr[k];
			}			
			
			System.out.println("#" + (i+1) + " " + result);
			
		}
	
	
	}

}
