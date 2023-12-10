class Solution {
    public boolean solution(int x) {
        int num = x;
        int sum = 0;
        while(x>0){
            sum += (x % 10);
            x /= 10;
        }
        if((num % sum) != 0) return false;
        else return true;
    }
}