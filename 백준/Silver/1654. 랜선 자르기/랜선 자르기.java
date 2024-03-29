import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int K = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		long[] arr = new long[K];
		
		long left = 1;
		long right = 0;
		long answer = 0;
		for(int i = 0; i < K; i++){
		    arr[i] = Long.parseLong(br.readLine());
		    right = Math.max(right, arr[i]);
		}
		
		while(left <= right){
		    long mid = (left + right) / 2;
		    long sum = 0;
		    
		    for(long value : arr){
		        sum += (value / mid);
		    }
		    
		    if(sum >= N){
		        left = mid + 1;
		        answer = Math.max(answer, mid);
		    } else {
		        right = mid - 1;
		    } 
		}
		System.out.println(answer);
	}
}