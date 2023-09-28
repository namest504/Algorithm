import java.util.*;

class Solution {
    // static int[][] map;
    static boolean[][] visit;
    static int[] opX = {-1, 1, 0, 0};
    static int[] opY = {0, 0, -1, 1};
    static int N;
    static int M;
    static Queue<Pos> que;
    static class Pos{
        int y;
        int x;
        
        Pos(int x, int y){
            this.y = y;
            this.x = x;
        }
    }
    
    public int solution(int[][] maps) {
        N = maps[0].length;
        M = maps.length;
        visit = new boolean[M][N];
        
        // System.out.println("맵 사이즈 = " + N + " : " + M);
        // view(maps);
        bfs(maps, new Pos(0,0));
        int answer = maps[M - 1][N - 1];
        System.out.println("answer = " + answer);
        // view(maps);
        if(answer == 1) return -1;
        return answer;
    }
    
    private void bfs(int[][] maps, Pos pos){
        que = new LinkedList<>();
        visit[pos.y][pos.x] = true;
        que.offer(pos);
        
        while(!que.isEmpty()){
            Pos now = que.poll();
            if(now.x == N-1 && now.y == M-1){
                break;
            }
            for(int i = 0; i < 4; i++){
            int nX = now.x + opX[i];
            int nY = now.y + opY[i];
            
            if(checkRange(nX, nY)){
                if(maps[nY][nX] != 0 && !visit[nY][nX]){
                    visit[nY][nX] = true;
                    que.offer(new Pos(nX, nY));
                    maps[nY][nX] += maps[now.y][now.x];
                }
            }
            // System.out.println(nX + " : " + nY);
            }
        }
        
    }
    
    private boolean checkRange(int x, int y){
        if(-1<x && x<N && -1<y && y<M) return true;
        return false;
    }
    
    private void view(int[][] maps){
        for(int[] y : maps){
            for(int x : y){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}