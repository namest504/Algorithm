class Solution {
    public int solution(int n) {
        int countOne = getCountOne(n);
        int count = 0;
        while(countOne != count){
            n++;
            count = getCountOne(n);
        }
        return n;
    }
    
    private int getCountOne(int num){
        return Integer.toBinaryString(num).replace("0", "").length();
    }
}