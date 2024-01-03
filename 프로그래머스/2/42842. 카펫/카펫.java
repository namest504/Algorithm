class Solution {
    public int[] solution(int brown, int yellow) {
        int area = brown + yellow;
        int[] answer = {};
        
        for(int i = 3; i < area; i++){
            if((area % i) == 0){
                int h = area/i;
                if( ((i-2) * (h-2)) == yellow){
                    return new int[]{h, i};
                }
            }
        }
        return answer;
    }
} 