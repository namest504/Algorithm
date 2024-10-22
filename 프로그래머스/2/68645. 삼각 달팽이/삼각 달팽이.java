class Solution {
    private static final int[] dx = {0, 1, -1};
    private static final int[] dy = {1, 0, -1};
    
    public int[] solution(int n) {
        int[][] map = new int[n][n];
        int x = 0;
        int y = 0;
        int v = 1;
        int d = 0;
        
        if (n == 1) {
            return new int[]{1};
        }
        
        while(true) {
            map[y][x] = v++;
            int nx = x + dx[d];
            int ny = y + dy[d];
            if(check(n, nx, ny, map)) {
                d = (d+1) % 3;
                nx = x + dx[d];
                ny = y + dy[d];
                if(check(n, nx, ny, map)) break;
            }    
            x = nx;
            y = ny;
        }
        
        int[] answer = new int[v-1];
        int idx = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                answer[idx++] = map[i][j];
            }
        }
        return answer;
    }
    
    private static boolean check(int n, int nx, int ny, int[][] map) {
        if(nx == n || ny == n || nx == -1 || ny == -1 || map[ny][nx] != 0) return true;
        return false;
    }
}