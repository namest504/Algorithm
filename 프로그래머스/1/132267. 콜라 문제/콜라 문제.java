class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int left = 0;
        while(n >= a){
            left = n % a;
            n = (n / a) * b;
            answer += n;
            n += left;
        }
        return answer;
    }
}