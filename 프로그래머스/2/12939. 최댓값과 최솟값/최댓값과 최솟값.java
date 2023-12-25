import java.util.*;
class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        List<Integer> list = new ArrayList<>();
        for(String str : s.split(" ")){
            list.add(Integer.parseInt(str));
        }
        Collections.sort(list);
        return sb.append(list.get(0)).append(" ").append(list.get(list.size()-1)).toString();
    }
}