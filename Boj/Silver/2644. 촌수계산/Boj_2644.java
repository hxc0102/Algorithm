package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Boj_2644 {
	static int N, M, start, end;
	static int[][] graph;
	static boolean[] visited;
	static int[] count;
	
	static Queue<Integer> queue = new LinkedList<Integer>();
	
	public static void bfs(int start) { 
		queue.add(start);
		visited[start] = true;
		while(!queue.isEmpty()) {
	
			start = queue.poll();

			if(start == end) break;
		
		
			for(int i = 1; i<= N; i++) {
				if(!visited[i] && graph[start][i] == 1) {
					queue.add(i);
					visited[i] = true;
					count[i] = count[start] + 1;
					
				}
			}
		
		}
	}
	
	
	public static void main(String[] args) throws IOException {
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  StringTokenizer st = new StringTokenizer(br.readLine());
		  
		  
		  N = Integer.parseInt(st.nextToken());
		  graph = new int[N+1][N+1];  
		  visited = new boolean[N+1];
		  count = new int[N+1];
		  
		  st = new StringTokenizer(br.readLine());			  
		  start = Integer.parseInt(st.nextToken());
		  end = Integer.parseInt(st.nextToken());
		  
		  st = new StringTokenizer(br.readLine());
		  M = Integer.parseInt(st.nextToken());

		  for(int i = 1; i <= M; i++) {
				st = new StringTokenizer(br.readLine());
	    		int f = Integer.parseInt(st.nextToken());
	    		int e = Integer.parseInt(st.nextToken());
	     		graph[f][e] = graph[e][f] = 1;
	    	}
		  
		  	bfs(start);
		  	
		  	System.out.println(count[end] == 0 ? -1 : count[end]);
		  
	  }
}