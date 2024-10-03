import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[]{0, 0};

        Set<String> record = new HashSet<>();
        int[] count = new int[n];
        /*
        n = 3
        0 1번
        1 2번
        2 3번
        3 1번
        4 2번
        5 3번
        6 1번
        i%3 + 1
        */
        char before = words[0].charAt(words[0].length()-1);
        char now;
        for(int i = 0; i < words.length; i++) {
            int man = i%n + 1; // x 번 째 사람
            count[man-1] += 1;
            if(i != 0) {
                before = words[i-1].charAt(words[i-1].length()-1);
                now = words[i].charAt(0);
                if(before != now) {
                    return new int[]{man, count[man-1]};
                }
            }
            System.out.println("before : " + before);
            if(!record.contains(words[i])) {
                record.add(words[i]);
            } else {
                return new int[]{man, count[man-1]};
            }
            System.out.println(man + " : " + count[man-1]);
        }

        return answer;
    }
}