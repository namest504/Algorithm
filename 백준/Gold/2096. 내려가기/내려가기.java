import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;

		int[][] dp = new int[N+1][3];
		for(int i = 1; i < N+1; i++) {
			st = new StringTokenizer(br.readLine());

			for(int j = 0; j < 3; j++) {
				dp[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		br.close();
		solution(N, dp);
	}

	private static void solution(int N, int[][] dp) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[][] maxDp = new int[N+1][3], minDp = new int[N+1][3];
		for(int i = 1; i <= N; i++) {
			maxDp[i][0] += Math.max(maxDp[i-1][0], maxDp[i-1][1]) + dp[i][0];
			maxDp[i][1] += Math.max(maxDp[i-1][2], Math.max(maxDp[i-1][0], maxDp[i-1][1])) + dp[i][1];
			maxDp[i][2] += Math.max(maxDp[i-1][1], maxDp[i-1][2]) + dp[i][2];

			minDp[i][0] += Math.min(minDp[i-1][0], minDp[i-1][1]) + dp[i][0];
			minDp[i][1] += Math.min(minDp[i-1][2], Math.min(minDp[i-1][0], minDp[i-1][1])) + dp[i][1];
			minDp[i][2] += Math.min(minDp[i-1][1], minDp[i-1][2]) + dp[i][2];
		}

		int answerMax = Integer.MIN_VALUE, answerMin = Integer.MAX_VALUE;
		for(int i = 0; i < 3; i++) {
			answerMax = Math.max(answerMax, maxDp[N][i]);
			answerMin = Math.min(answerMin, minDp[N][i]);
		}

		bw.write(answerMax + " " + answerMin);
		bw.flush();
		bw.close();
	}
}