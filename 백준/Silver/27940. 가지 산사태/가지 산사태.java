import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		st.nextToken();
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		for (int i = 0; i<M; i++) {
			st = new StringTokenizer(br.readLine()," ");
			st.nextToken();
			K -= Integer.parseInt(st.nextToken());
			if (K < 0) {
				System.out.println((i+1)+" "+1);
				return;
			}
		}
		System.out.println(-1);
    }
}