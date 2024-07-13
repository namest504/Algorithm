import java.io.*;
import java.util.*;

public class Main {
    
    private static int N, len, result;
    private static int[] K;
    
    public static void main(String[] args) throws IOException {
        // init input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
         len = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        K = new int[len];
        for(int i = 0; i < len; i++) {
            K[i] = Integer.parseInt(st.nextToken());
        }

        // solution
        dfs(0);
        System.out.println(result);
    }

    private static void dfs(int num){
        if(N < num) return;
        if(result < num) result = num;
        for(int i = 0; i < len; i++) {
            dfs((num * 10) + K[i]);
        }
    }
}