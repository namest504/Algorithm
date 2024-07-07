import java.io.*;
import java.util.*;

public class Main {

    private static char[][] map;
    private static boolean[][] visited;
    private static int N;
    private static int M;
    private static int answer;
    
    public static void main(String[] args) throws  IOException {
        // init input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new char[N][M];
        visited = new boolean[N][M];
        answer = 0;
        
        for(int i = 0; i < N; i++) {
            String line = br.readLine();
            for(int j = 0; j < M; j++) {
                map[i][j] = line.charAt(j);
            }
        }
        
        // solution
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                dfs(i, j);
            }
        }
        System.out.println(answer);
    }

    private static void dfs(int y, int x) {
        if(visited[y][x]) {
            return;
        }
        visited[y][x] = true;

        if(map[y][x] == '-') {
            int nextX = x + 1;
            if(check(y, nextX) && map[y][nextX] == '-') {
                dfs(y, nextX);
            } else {
                answer++;
                return;
            }
        } else if (map[y][x] == '|') {
            int nextY = y + 1;
            if(check(nextY, x) && map[nextY][x] == '|') {
                dfs(nextY, x);
            } else {
                answer++;
                return;
            }
        }
    }

    private static boolean check(int y, int x) {
        if(-1 < y && y < N && -1 < x && x < M) {
            return true;
        }
        return false;
    }
}