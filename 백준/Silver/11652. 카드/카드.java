import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        Map<Long, Long> map = new HashMap<>();
        
        long input = 0;
        for(int i = 0; i< N; i++) {
            input = Long.parseLong(br.readLine());
            
            map.put(input, map.getOrDefault(input, 0L) + 1);
        }
        
        long answer = Long.MAX_VALUE;
        long maxCount = 0;
        for(Long key : map.keySet() ) {
            if(maxCount < map.get(key)) {
                answer = key;   
                maxCount = map.get(key);
            } else if (maxCount == map.get(key)) {
                answer = Math.min(answer, key);
            }
        }
        
        System.out.print(answer);
    }
}