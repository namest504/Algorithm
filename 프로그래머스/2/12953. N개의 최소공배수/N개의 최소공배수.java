class Solution {
    public int solution(int[] arr) {
        return lcm(arr);
    }
    
    private int lcm(int[] arr){
        if(arr.length == 1) return arr[0];
        
        int gcb = gcb(arr[0], arr[1]);
        int lcm = (arr[0] * arr[1]) / gcb;
        
        for(int i = 2; i < arr.length; i++){
            gcb = gcb(lcm, arr[i]);
            lcm = (lcm * arr[i]) / gcb;
        }
        
        return lcm;
    }
    private int gcb(int a, int b){
        if(a % b == 0) return b;
        return gcb(b, a % b);
    }
}