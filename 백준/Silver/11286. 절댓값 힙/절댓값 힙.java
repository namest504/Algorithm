import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> que = new PriorityQueue<>((o1, o2) ->{
            if(Math.abs(o1) > Math.abs(o2)) {
				return Math.abs(o1) - Math.abs(o2);
			}else if(Math.abs(o1) == Math.abs(o2)) {
				return o1 - o2;
			}else {
				return -1;
			}
        });

        for(int i = 0; i < N; i++){
            int input = Integer.parseInt(br.readLine());
            if(input == 0){
                if(que.isEmpty()) System.out.println(0);
                else System.out.println(que.poll());
            } else{
                que.add(input);
            }
        }
    }
}