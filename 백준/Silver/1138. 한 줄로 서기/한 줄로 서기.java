import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // init input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        // solution
        
        List<Integer> answer = new ArrayList<>();
        for(int i = N; i >= 1; i--) {
            answer.add(arr[i-1], i);
        }
        
        answer.stream().forEach(a -> System.out.print(a + " "));
    }
}