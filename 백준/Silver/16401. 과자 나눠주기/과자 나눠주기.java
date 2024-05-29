import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        // init
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        
        int[] L = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            L[i] = Integer.parseInt(st.nextToken());
        }
        
        // solution
        
        Arrays.sort(L);
        
        int left = 1;
        int right = L[N-1];
        int result = 0;
        
        while(left <= right){
            int mid = (left+right) / 2;
            int cnt = 0;
            
            for(int i = 0; i < N; i++){
                cnt += L[i]/mid;
            }
            
            if(cnt >= M) {
                left = mid + 1;
                result = Math.max(result, mid);
            } else {
                right = mid - 1;
            }
        }
        
        System.out.println(result);
    }
}