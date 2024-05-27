import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        // init input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] tops = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        for(int i = 0; i < n; i++){
            tops[i] = Integer.parseInt(st.nextToken());
        }
        
        // solution
        StringBuilder sb = new StringBuilder();
        Stack<int[]> stack = new Stack<>();
        
        for(int i = 0; i < n; i++) {
            while(!stack.isEmpty()) {
                if(stack.peek()[1] > tops[i]) {
                    sb.append(stack.peek()[0] + " ");
                    break;
                } else {
                    stack.pop();
                }
            }
            
            if(stack.isEmpty()){
                sb.append("0 ");
            }
            
            stack.add(new int[] {i+1, tops[i]});
        }
        System.out.println(sb);
    }
}