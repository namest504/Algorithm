import java.io.*;
import java.util.*;

public class Main {
	private static int N;
	private static int answerW;
	private static int answerB;
	private static int[][] paper;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		paper = new int[N+1][N+1];
		StringTokenizer st;
		for(int i = 0; i < N; i++){
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++) {
				paper[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		separate(0,0,N);
		System.out.println(answerW);
		System.out.println(answerB);
	}

	private static void separate(int y, int x, int size) {
		int blue = checkBlue(y, x, size);
		if(blue == size*size) {
			answerB++;
		} else if (blue == 0) {
			answerW++;
		} else {
			separate(y, x, size/2);
			separate(y + size/2, x, size/2);
			separate(y, x + size/2, size/2);
			separate(y + size/2, x + size/2, size/2);
		}
		return;
	}

	private static int checkBlue(int y, int x, int size) {
		int tempBlue = 0;
		for(int i = y; i < y + size; i++){
			for(int j = x; j < x + size; j++) {
				if(paper[i][j] == 1) tempBlue++;
			}
		}	
		return tempBlue;
	}
}