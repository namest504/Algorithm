class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        int idx1 = 0, idx2 = 0, cnt = 0;
        
        for(String word : goal){
            if(idx1 < cards1.length){
                if(cards1[idx1].equals(word)){
                    idx1++;
                    cnt++;
                }
            } 
            if(idx2 < cards2.length){
                if(cards2[idx2].equals(word)){
                    idx2++;
                    cnt++;
                }
            }
        }
        if(cnt == goal.length) return "Yes";
        else return "No";
    }
}