import java.io.*;
import java.util.*;

public class Main {

	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int T = Integer.parseInt(br.readLine());
		for(int t = 0; t < T; t++) {
			int N = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] arr = new int[N];
			for(int n = 0; n < N; n++) {
				arr[n] = Integer.parseInt(st.nextToken());
			}

			Long answer = 0L;
			int max = arr[N-1];
			for(int n = N-2; n >= 0; n--) {
				if(arr[n] > max){
					max = arr[n];
				} 
				else {
					answer += (max-arr[n]);
				}
			}
			bw.write(String.valueOf(answer));
			bw.write("\n");
		}
		bw.flush();
		br.close();
		bw.close();
	}
}