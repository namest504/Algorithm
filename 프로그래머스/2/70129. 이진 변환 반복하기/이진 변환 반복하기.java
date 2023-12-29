import java.lang.*;
import java.util.*;
class Solution {
    public int[] solution(String string) {
        StringBuilder sb;
        int countZero = 0;
        int countLoop = 0;
        while(!string.equals("1")){
            sb = new StringBuilder();
            for(String s : string.split("")){
                if(s.equals("0")) countZero++;
                else sb.append(s);
            }
            string = String.valueOf(Integer.toBinaryString(sb.toString().length()));
            countLoop++;
        }
        return new int[]{countLoop, countZero};
    }
}