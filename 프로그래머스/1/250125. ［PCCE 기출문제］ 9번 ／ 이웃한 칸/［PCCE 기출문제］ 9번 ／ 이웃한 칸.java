class Solution {
    private int H, W;
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        H = board.length;
        W = board[0].length;
        int[] opsH = {1, -1, 0, 0};
        int[] opsW = {0, 0, 1, -1};
        
        for(int i = 0; i < 4; i++){
            int nh = h + opsH[i];
            int nw = w + opsW[i];
            if(checkRange(nh, nw) && board[nh][nw].equals(board[h][w])){
                answer++;
            }
        }
        return answer;
    }
    
    private boolean checkRange(int h, int w){
        if(-1 < h && h < H && -1 < w && w < W) return true;
        return false;
    }
}