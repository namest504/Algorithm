import java.io.*;
import java.util.*;
class Main {
    
    private static int[][] paper;
    private static int[] answer;
    
    public static void main(String[] args) throws IOException {
        // init input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        paper = new int[N][N];
        StringTokenizer st;
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
               paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        answer = new int[3];
        
        // solution
        slice(N, paper);
        
        for(int i = 0; i < 3; i++){
            System.out.println(answer[i]);
        }
    }
    
    public static void slice(int n, int[][] paper) {
        if(check(paper)) {
            answer[paper[0][0] + 1]++;
            return;
        } else if (n == 1) {
            answer[paper[0][0] + 1]++;
            return;
        } 
        
        
        int[][] slicedPaper;
        
        for(int i = 0; i < n; i += n/3) {
            for(int j = 0; j < n; j += n/3) {
                slicedPaper = new int[n/3][n/3];
                
                for(int y = 0; y < n/3; y++) {
                    for(int x = 0; x < n/3; x++) {
                        slicedPaper[y][x] = paper[i+y][j+x];
                    }
                }
                slice(n/3, slicedPaper);
            }
        }
    }
    
    public static boolean check(int[][] arr) {
        int num = arr[0][0];
        for(int[] as : arr) {
            for(int a : as) {
                if(a != num) return false;
            }
        }
        return true;
    }
}