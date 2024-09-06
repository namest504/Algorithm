import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		// init
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int M = Integer.parseInt(br.readLine());
		StringTokenizer st;
		Set<Integer> S = new HashSet<>();

		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			String command = st.nextToken();
			int value = 0;
			switch(command) {
			case "add":
				value = Integer.parseInt(st.nextToken());
				S.add(value);
				break;
			case "remove":
				value = Integer.parseInt(st.nextToken());
				S.remove(value);
				break;
			case "check":
				value = Integer.parseInt(st.nextToken());
				if(S.contains(value)) bw.write(1+"\n");
				else bw.write(0+"\n");
				break;
			case "toggle":
				value = Integer.parseInt(st.nextToken());
				if(S.contains(value)) S.remove(value);
				else S.add(value);
				break;
			case "all":
				for(int j = 1; j <= 20; j++) {
					S.add(j);
				}
				break;
			case "empty":
				S = new HashSet<>();
				break;
			}
		}
		br.close();
		bw.flush();
		bw.close();
	}
}