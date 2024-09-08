import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		int right = Integer.MIN_VALUE;
		for(int i = 0; i < N; i++){
			arr[i] = Integer.parseInt(st.nextToken());
			right = Math.max(right, arr[i]);
		}
		int M = Integer.parseInt(br.readLine());
		br.close();

		// solution
		int left = 0;

		while(left <= right) {
			int mid = (left+right) / 2;
			int budget = 0;
			for(int a : arr) {
				if(a > mid) budget += mid;
				else budget += a; 
			}

			if(budget <= M) left = mid + 1;
			else right = mid - 1;
		}
		
		bw.write(String.valueOf(right));
		bw.flush();
		bw.close();

	}
}