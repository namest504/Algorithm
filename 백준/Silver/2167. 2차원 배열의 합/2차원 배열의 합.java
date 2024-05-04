import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[N][M];
		
		for(int i = 0; i < N; i++){
		    st = new StringTokenizer(br.readLine());
		    for(int j = 0; j < M; j++){
		        arr[i][j] = Integer.parseInt(st.nextToken());
		    }
		}
		
		int K = Integer.parseInt(br.readLine());
		int i, j, x, y, result;
		
		for(int t = 0; t < K; t++){
		    st = new StringTokenizer(br.readLine());
		    
		    i = Integer.parseInt(st.nextToken());
		    j = Integer.parseInt(st.nextToken());
		    x = Integer.parseInt(st.nextToken());
		    y = Integer.parseInt(st.nextToken());
		    
		    result = 0;
		    
		    for(int a = i; a <= x; a++){
		        for(int b = j; b <= y; b++){
		            result += arr[a-1][b-1];
		        }
		    }
		    System.out.println(result);
		}
	}
}