class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int rowLen = arr1[0].length;
        int colLen = arr1.length;
        
        int[][] answer = new int[colLen][rowLen];
        
        for(int i = 0; i < colLen; i++){
            for(int j = 0; j < rowLen; j++){
               answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
}