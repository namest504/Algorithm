import java.io.*;
import java.util.*;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int nScore = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());

		if( N == 0) {
			bw.write(String.valueOf(1));
			bw.flush();
			return;
		}
		st = new StringTokenizer(br.readLine());
		
		List<Integer> scores = new ArrayList<>();
		int index = 0;
		int rank = 1;
		for(int i = 0; i < N; i++) {
			int value = Integer.parseInt(st.nextToken());
			if(value > nScore){
				index++;
				rank++;
			} else if (value == nScore) {
				index++;
			}
		}

		bw.write(String.valueOf((index+1 > P) ? -1 : rank));
		bw.flush();
		br.close();
		bw.close();
	}
}