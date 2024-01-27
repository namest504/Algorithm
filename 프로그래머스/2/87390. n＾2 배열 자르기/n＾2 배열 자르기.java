class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right - left) + 1];
        
        int index = 0;
        for(long i = left; i <= right; i++, index++){
            answer[index] = Math.max( (int)(i / n), (int)(i % n) ) + 1;
        }
        
        return answer;
    }
}