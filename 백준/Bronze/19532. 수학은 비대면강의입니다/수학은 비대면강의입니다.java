import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());
		int f = Integer.parseInt(st.nextToken());

		for(int i = -999; i <= 999; i++){
			for(int j = -999; j <= 999; j++){
				if( (((a*i)+(b*j)) == c) && (((d*i)+(e*j)) == f) ) {
					System.out.print(i + " " + j);
				}
			}
		}
	}
}