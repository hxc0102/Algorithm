package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D2_1974 {
	static int N, result;
	static int[][] graph;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	N = Integer.parseInt(st.nextToken());
    	graph = new int[9][9];
		
		for(int k=0; k<N; k++) {
			result = 1;	
			
			for(int i=0; i<9; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j=0; j<9; j++) {
					graph[i][j] = Integer.parseInt(st.nextToken());
				}	
			}
			
			for(int i=0; i<9; i++) {
				int row = 0;
				int col = 0;
				for(int j=0; j<9; j++) {
					row += graph[i][j];
					col += graph[j][i];
				}
				
				if(row != 45 || col != 45) {
					result = 0;
					break;
				}
			}
			if(result ==0) {
				System.out.println("#" + (k+1) + " " + result);
				continue;
			}
			
			for(int i=1; i<=3; i++) {
				int sum = 0;
				for(int j= (i-1)*3; j< i*3; j++){
					for(int a = (i-1)*3; a< i*3; a++) {
						sum += graph[j][a];
					}
				}		
				if(sum != 45) {
					result = 0;
					break;
				}
				
				if(result ==0) {
					break;
				}
			}
			System.out.println("#" + (k+1) + " " + result);
		}
	}
}
