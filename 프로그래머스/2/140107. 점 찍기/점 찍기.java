class Solution {
    public long solution(int k, int d) {
        long answer = 0;
        for(int a = 0; a <= d; a++){
            if((a*k) > d) break;
            int b = getB(d, (a*k));
            
            answer += (b / k) + 1;
        }
        return answer;
    }
    
    // b^2 = d^2 - a^2
    private static int getB(int d, int a){
        return (int) Math.sqrt((Math.pow(d, 2) - (Math.pow(a, 2))));
    }
}