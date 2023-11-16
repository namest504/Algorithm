class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(String babble : babbling){
            
            if( babble.contains("ayaaya") || babble.contains("yeye") ||
               babble.contains("woowoo") || babble.contains("mama")){
                continue;
            }
            
            babble = babble.replace("aya", " ");
            babble = babble.replace("ye", " ");
            babble = babble.replace("woo", " ");
            babble = babble.replace("ma", " ");
            babble = babble.replace(" ", "");
            
            if(babble.length() == 0) answer++;
        }
        return answer;
    }
}