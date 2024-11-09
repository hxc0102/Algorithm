package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Boj_2667{
	static int N, count = 1;
	static int[][] graph;
	static boolean[][] visited;
	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,1,-1};
	static List<Integer> result;
	
	
	public static void dfs(int x, int y) {
		visited[x][y] = true;
		
		for(int i=0; i<4; i++) {
			int nx = dx[i] + x;
			int ny = dy[i] + y;
			if(nx>=0 && ny>=0 && nx<N && ny<N && !visited[nx][ny] && graph[nx][ny] == 1) {
				count++;
				dfs(nx,ny);
			}
		}
		
		
	}
	
	
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	N = Integer.parseInt(st.nextToken());
    	graph = new int[N][N];
    	visited= new boolean[N][N];
    	result = new LinkedList<>();
    	
    	for(int i=0; i<N; i++) {
    		String s = br.readLine();
    		for(int j=0; j<N; j++) {
    			graph[i][j] = s.charAt(j) - '0';
    		}
    	}
    	
    	for(int i=0; i<N; i++) {
    		for(int j=0; j<N; j++) {
    			if(graph[i][j] == 1 && !visited[i][j]) {
    				dfs(i,j);
    				result.add(count);
    				count = 1;
    			}
    		}
    	}
    	
      	Collections.sort(result);
      	
      	System.out.println(result.size());
      	for(int i=0; i<result.size(); i++) {
      		System.out.println(result.get(i));
      	}
    	
    	
    }
}
