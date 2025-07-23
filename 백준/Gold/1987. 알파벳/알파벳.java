import java.io.*;
import java.util.*;

public class Main {
    private static int R, C;
    private static int[][] board;
    private static boolean[] visited = new boolean[26];
    private static int max = 0;
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        board = new int[R][C];

        for (int i = 0; i < R; i++) {
            String line = br.readLine();
            for (int j = 0; j < C; j++) {
                board[i][j] = line.charAt(j) - 'A';
            }
        }

        visited[board[0][0]] = true;
        dfs(0, 0, 1);
        System.out.println(max);
    }

    private static void dfs(int x, int y, int count) {
        max = Math.max(max, count);

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || ny < 0 || nx >= R || ny >= C) 
                continue;

            if (!visited[board[nx][ny]]) {
                visited[board[nx][ny]] = true;
                dfs(nx, ny, count + 1);
                visited[board[nx][ny]] = false;
            }
        }
    }
}