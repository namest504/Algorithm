import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		Queue<Integer> mans = new LinkedList<>();

		for(int i = 0; i < N; i++) {
			mans.add(i+1);
		}

		System.out.print("<");
		while(mans.size() > 1) {

			for(int i = 1; i < K; i++) {
				mans.add(mans.poll());
			}

			System.out.print(mans.poll() + ", ");
		}

		System.out.print(mans.poll() + ">");
	}
}