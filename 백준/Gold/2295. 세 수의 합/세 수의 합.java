import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // init input
        int N = Integer.parseInt(br.readLine());
        int[] U = new int[N];
        for(int i = 0; i < N; i++) {
            U[i] = Integer.parseInt(br.readLine());
        }
        
        // solution
        Arrays.sort(U);
        Set<Integer> sum = new HashSet<>();
        
        for(int i = 0; i < N; i++){
            for(int j = i; j< N; j++){
                sum.add(U[i] + U[j]);
            }
        }
        
        int answer = -1;
        
        for(int i = 0; i < N; i++){
            for(int j = 0; j< N; j++){
                if(sum.contains(U[i] - U[j])) {
                    answer = Math.max(answer, U[i]);
                }
            }
        }
        
        // for(int i = 0; i < N; i++){
        //     for(int j = 0; j< N; j++){
        //         if(Arrays.binarySearch(sum.toArray(), U[i] - U[j]) > -1) {
        //             answer = Math.max(answer, U[i]);
        //         }
        //     }
        // }
        
        System.out.println(answer);
    }
}