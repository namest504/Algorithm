class Solution {
    public int[] solution(int n, int m) {
        return new int[]{gcb(n,m), lcm(n,m)};
    }
    
    private int lcm(int a, int b){
        return ( a * b ) / gcb(a,b);
    }
    
    private int gcb(int a, int b){
        int r;
        while(b != 0){
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}