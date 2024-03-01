import java.util.*;
class Solution {
    class Pos {
        int y;
        int x;
        
        public Pos(int y, int x){
            this.y = y;
            this.x = x;
        }
    }
    private int[][] maps = new int[11][11];
    private boolean[][][] visit = new boolean[11][11][4];
    private int answer = 0;
    
    public int solution(String dirs) {
        
        Pos nowPos = new Pos(5,5);
        
        for(String dir : dirs.split("")){
            Pos movedPos = move(nowPos,dir);
            nowPos=movedPos;
        }
        return answer;
    }
    
    // 북-0 남-1 서-2 동-3
    private Pos move(Pos nowPos, String dir){
        if(dir.equals("U")){
            if(checkMap(nowPos.y + 1, nowPos.x)){
                if(!visit[nowPos.y + 1][nowPos.x][1]){
                    answer++;
                    visit[nowPos.y][nowPos.x][0] = true;
                    visit[nowPos.y + 1][nowPos.x][1] = true;
                }
                return new Pos(nowPos.y + 1, nowPos.x);
            } else{
                return nowPos;  
            }
        } else if(dir.equals("D")){
            if(checkMap(nowPos.y - 1, nowPos.x)){
                if(!visit[nowPos.y - 1][nowPos.x][0]){
                    answer++;
                    visit[nowPos.y][nowPos.x][1] = true;
                    visit[nowPos.y - 1][nowPos.x][0] = true;
                }
                return new Pos(nowPos.y - 1, nowPos.x);
            } else{
                return nowPos;  
            }
        } else if(dir.equals("R")){
            if(checkMap(nowPos.y, nowPos.x + 1)){
                if(!visit[nowPos.y][nowPos.x + 1][2]){
                    answer++;
                    visit[nowPos.y][nowPos.x][3] = true;
                    visit[nowPos.y][nowPos.x + 1][2] = true;
                }
                return new Pos(nowPos.y, nowPos.x + 1);
            } else{
                return nowPos;  
            }
        } else {
            if(checkMap(nowPos.y, nowPos.x - 1)){
                if(!visit[nowPos.y][nowPos.x - 1][3]){
                    answer++;
                    visit[nowPos.y][nowPos.x][2] = true;
                    visit[nowPos.y][nowPos.x - 1][3] = true;
                }
                return new Pos(nowPos.y, nowPos.x - 1);
            } else{
                return nowPos;  
            }
        }
    }
    
    private boolean checkMap(int y, int x){
        if(-1 < y && y < 11 && -1 < x && x < 11) return true;
        return false;
    }
    
    private void view(){
        for(int i = 0; i < 11; i++){
            for(int j = 0; j < 11; j++){
                System.out.print("("+ (j-5) + "," + (i-5) +")"+ "\t");
            }
            System.out.println();
        }
    }
}