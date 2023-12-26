class Solution {
    boolean solution(String s) {
        int pCnt = 0;
        int yCnt = 0;
        for(String st : s.split("")){
            if(st.equals("p") || st.equals("P")) pCnt++;
            else if(st.equals("y") || st.equals("Y")) yCnt++;
        }
        if(pCnt == 0 && yCnt == 0) return true;
        return pCnt == yCnt ? true : false;
    }
}