import java.util.*;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i = 0; i < n; i++){
            answer[i] = compare(
                padFoward(n, Integer.toBinaryString(arr1[i])),
                padFoward(n, Integer.toBinaryString(arr2[i]))
            ).replace("1", "#").replace("0", " ");
        }
        return answer;
    }
    
    private String padFoward(int n, String str){
        if(str.length() < n){
            for(int i = str.length(); i < n; i++){
                str = "0" + str;
            }
        }
        return str;
    }
    
    private String compare(String s1, String s2){
        StringBuilder sb = new StringBuilder();
        String[] sr1 = s1.split("");
        String[] sr2 = s2.split("");
        
        for(int i = 0; i < sr1.length; i++){
            if(sr1[i].equals("0") && sr2[i].equals("0")){
                sb.append("0");
            } else {
                sb.append("1");
            }
        }        
        return sb.toString();
    }
}