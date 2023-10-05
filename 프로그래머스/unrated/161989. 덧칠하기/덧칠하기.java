class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int pos = 0;
        
        for(int i = 0; i < section.length; i++){
            if(section[i] >= pos){
                pos = section[i] + m;
                answer++;
            }
        }
        return answer;
    }
}