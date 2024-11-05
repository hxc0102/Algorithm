package algorithm;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Boj_1260{
	
	static int[][] graph;
	static boolean[] visited;
	static int N, M, V;
	static Queue <Integer> queue = new LinkedList<>();
	static StringBuilder sb = new StringBuilder();
	
	public static void dfs(int node) { 
		visited[node] = true;
		sb.append(node).append(" ");
		
		for(int i = 1; i< N + 1; i++) {
			if(!visited[i] && graph[node][i] == 1)
				dfs(i);
		}
	}
	
	public static void bfs(int node) {
		queue.add(node);
		visited[node] = true;
		
		sb.append('\n');
		while(!queue.isEmpty()) {
			
			node = queue.poll();
			sb.append(node).append(" ");
			
			for(int i = 1; i< N + 1; i++) {
				if(!visited[i] && graph[node][i] == 1) {
					queue.add(i);
					visited[i] = true;
				}
			}
		}
		
		
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	N = Integer.parseInt(st.nextToken());
    	M = Integer.parseInt(st.nextToken());
    	V = Integer.parseInt(st.nextToken());
    	
    	graph = new int[N+1][N+1];
    	visited = new boolean[N+1];
    	
    	for(int i = 0; i < M; i++) {
    		st = new StringTokenizer(br.readLine());
    		int f = Integer.parseInt(st.nextToken());
    		int e = Integer.parseInt(st.nextToken());
    	
    		graph[f][e] = graph[e][f] = 1;
    	}	
    	
    	dfs(V);
    	Arrays.fill(visited, false);
    	bfs(V);    
    	System.out.println(sb);
    	}
}
