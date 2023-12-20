class Solution {
    public String solution(String[] seoul) {
        int x = 0;
        for(String s : seoul){
            if(s.equals("Kim")) break;
            x++;
        }
        return String.format("김서방은 %d에 있다", x);
    }
}