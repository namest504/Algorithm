import java.io.*;
import java.util.*;

// f(x) = n*x^2 값을 에라스토스테네스의 체로 검증
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        long min = Long.parseLong(st.nextToken());
        long max = Long.parseLong(st.nextToken());
        
        // 체크 해야 할 전체 개수
        long answer = max - min + 1;
        //  에라토스테네스의 체 배열
        boolean[] checked = new boolean[(int)answer];

        // 제곱수 계산
        for(long i = 2; i*i < max+1 ; i++) {
            long sqaureNumber = i*i;
            
            // 계산을 시작할 값 계산
            long start = min/sqaureNumber;
            if(min % sqaureNumber != 0) {
                start += 1;
            }
            
            // 제곱수(s) -> n*s  처리
            for(long j = start; j*sqaureNumber < max+1; j++) {
                long num = j*sqaureNumber-min;
                
                // 현재 값 처리
                if(!checked[(int)num]) {
                    checked[(int)num] = true;
                    answer--;
                }
            }
        }
        
        System.out.println(answer);
    }
}