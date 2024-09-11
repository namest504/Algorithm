import java.io.*;
import java.util.*;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	private static int N;
	public static void main(String[] args) throws IOException {
		N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int M = Integer.parseInt(br.readLine());
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int isMan = Integer.parseInt(st.nextToken());
			int value = Integer.parseInt(st.nextToken());
			if( isMan == 1) {
				arr = funcMan(arr, value);
			} else {
				arr = funcWomen(arr, value);
			}
		}

		for(int i = 0; i < arr.length; i++) {
			if(i != 0 && i % 20 == 0) {
				bw.write("\n");
			}
			bw.write(arr[i] + " ");
		}
		bw.flush();
		br.close();
		bw.close();
	}

	private static int[] funcMan(int[] arr, int value) {
		int idx = value;
		while(value <= N) {
			arr[value-1] = convert(arr[value-1]);
			value += idx;
		}
		return arr;
	}

	private static int[] funcWomen(int[] arr, int value) {
		if(value == 1 || value == N) {
			arr[value-1] = convert(arr[value-1]);
			return arr;
		} 
		arr[value-1] = convert(arr[value-1]);

		int left = value - 1;
		int right = value + 1;
		while((left >= 1 && right <= N)) {

			if(arr[left-1] == arr[right-1]) {
				arr[left-1] = convert(arr[left-1]);
				arr[right-1] = convert(arr[right-1]);
			} else {
				break;
			}

			left--;
			right++;
		}
		return arr;
	}

	private static int convert(int a) {
		return (a + 1) % 2;
	}
}