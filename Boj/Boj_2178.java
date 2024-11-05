package algorithm;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Boj_2178{
	
	static int[][] graph;
	static boolean[][] visited;
	static int N, M;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	
	
	static Queue <int[]> queue = new LinkedList<>();
	static StringBuilder sb = new StringBuilder();
	public static void bfs(int x, int y) {

		queue.add(new int[] {x,y} );
		
		
		while(!queue.isEmpty()) {
			int arr[] = queue.poll();
			int arrx = arr[0];
			int arry = arr[1];
			
			for(int i = 0; i< 4; i++) {
				int nextX = arrx + dx[i];
				int nextY = arry + dy[i];
				
				if(nextX < 0 || nextY < 0 || nextX >= N || nextY >= M) 
					continue;
				else if(visited[nextX][nextY] || graph[nextX][nextY] == 0)
					continue;
				else {
					queue.add(new int[] {nextX, nextY});
					graph[nextX][nextY] = graph[arrx][arry] +1;
					visited[nextX][nextY] = true;
				}
				
				
			}
		}
	}
		
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	N = Integer.parseInt(st.nextToken());
    	M = Integer.parseInt(st.nextToken());
    	graph = new int[N][M];
    	visited = new boolean[N][M];
    	
    	for(int i = 0; i < N; i++) {
    		String s = br.readLine();
    		for(int j =0; j< M; j++) {
    			graph[i][j] = s.charAt(j) - '0';
    		}
    	}
    	bfs(0, 0);
    	System.out.println(graph[N-1][M-1]);
    }    
}