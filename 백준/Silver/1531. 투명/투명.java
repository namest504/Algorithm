import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] map = new int[100][100];
        
        for(int i = 0; i < n; i++) {
            StringTokenizer paper = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(paper.nextToken()) -1;
            int y1 = Integer.parseInt(paper.nextToken()) -1;
            int x2 = Integer.parseInt(paper.nextToken()) -1;
            int y2 = Integer.parseInt(paper.nextToken()) -1;
            for(int j = y1; j <= y2; j++) {
                for(int k = x1; k <= x2; k++) {
                    map[j][k]++;
                }
            }
        }
        
        int cnt = 0;
        for(int i = 0; i < 100; i++) {
            for(int j = 0; j < 100; j++) {
                if(map[i][j] > m) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}