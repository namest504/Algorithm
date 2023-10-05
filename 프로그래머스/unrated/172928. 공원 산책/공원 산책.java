import java.util.*;

class Solution {
    static class Pos{
        int y;
        int x;
        public Pos(int y, int x){
            this.y = y;
            this.x = x;
        }
    }
    static int N;
    static int M;
    static int nX;
    static int nY;
    static char[][] map;
    
    public int[] solution(String[] park, String[] routes) {
        N = park.length;
        M = park[0].length();
        map = new char[N][M];
        
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                char c = park[i].charAt(j);
                map[i][j] = c;
                if(c == 'S'){
                    nY = i;
                    nX = j;
                }
            }
        }
        
        for(String route : routes){
            String way = route.split(" ")[0];
            int times = Integer.parseInt(route.split(" ")[1]);
            
            int[] pos = new int[2];
            pos[0] = nX;
            pos[1] = nY;
            move(way, times, pos);
        }
        
        
        return new int[]{nY, nX};
    }
    
    private void move(String way, int times, int[] pos){
        
        for(int i = 0; i < times; i++){
            if(way.equals("N")){
                pos[1]--;
            }else if(way.equals("S")){
                pos[1]++;
            }
            else if(way.equals("W")){
                pos[0]--;
            }
            else if(way.equals("E")){
                pos[0]++;
            } 
            
            if(!checkRange(pos[1], pos[0])){
                return;
            }
            if(checkWalls(pos[1], pos[0])){
                return;   
            }
        }
        nX = pos[0];
        nY = pos[1];
    }
    
    private boolean checkRange(int y, int x){
        if(-1<y && y<N && -1<x && x<M) {
            return true;
        }
        else{
            return false;
        }
    }
    
    private boolean checkWalls(int y, int x){
        if(map[y][x] == 'X') {
            return true;
        }
        else{
            return false;
        }
    }
}