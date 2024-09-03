import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		// init
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int H = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		br.close();

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// soluction
		int y = 0;
		y += (H / (N + 1));
		if((H % (N + 1)) != 0) {
			y++;
		}

		int x = 0;
		x += (W / (M + 1));
		if((W % (M + 1)) != 0) {
			x++;
		}

		bw.write(String.valueOf(y*x));
		bw.flush();
		bw.close();
	}
}