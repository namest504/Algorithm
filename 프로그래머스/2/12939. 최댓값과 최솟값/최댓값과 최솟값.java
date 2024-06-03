import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] sArr = s.split(" ");
        int[] arr = new int[sArr.length];
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(sArr[i]);
        }
        Arrays.sort(arr);
        return arr[0] +" "+ arr[arr.length-1];
    }
}