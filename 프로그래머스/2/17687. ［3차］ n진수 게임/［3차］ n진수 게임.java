class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        String value = "";
        int num = 0;
        p = p % m;
        while((sb.length() / m) < t){
            sb.append(Integer.toString(num, n).toUpperCase());
            num++;
        }
        
        int time = 1;
        String[] strs = sb.toString().split("");
        sb.setLength(0);
        
        for(String s : strs){
            if(time % m == p){
                sb.append(s);
            }
            time++;
            if(sb.length() == t){
                break;
            }
        }
        return sb.toString();
    }
}