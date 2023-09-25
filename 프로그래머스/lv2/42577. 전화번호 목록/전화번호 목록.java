import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        int length = phone_book.length;
        Arrays.sort(phone_book);
        boolean answer = true;
        
        HashSet<String> hSet = new HashSet<>();
        
        for(String v : phone_book){
            hSet.add(v);
        }
        
        for(int i = 0 ; i < length ; i++){
            int pLength = phone_book[i].length();
            for(int j = 0 ; j < pLength ; j++){
                String sub = phone_book[i].substring(0, j);
                if(hSet.contains(sub)){
                    answer = false;
                    break;
                }
            }
        }
        return answer;
    }
}