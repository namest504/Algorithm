import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		// init input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		int[][] sheet = new int[N][5];

		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 5; j++) {
				sheet[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		// solution

		int std = 1;
		int max = 0;
		int cnt = 0;
		for(int i = 0; i < N; i++) {
			cnt = 0;

			for(int j = 0; j < N; j++) {
				if(i==j) continue;

				for(int k = 0; k < 5; k++) {
					if(sheet[i][k] == sheet[j][k]) {
						cnt++;
						break;
					}
				}
			}

			if(cnt > max) {
				max = cnt;
				std = i+1;
			}
		}

		System.out.println(std);
	}
}