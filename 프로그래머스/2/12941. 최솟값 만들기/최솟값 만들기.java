import java.util.*;
class Solution{
    public int solution(int[] A, int[] B){
        int answer = 0;
        PriorityQueue<Integer> a = new PriorityQueue<>();
        PriorityQueue<Integer> b = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i = 0; i < A.length; i++){
            a.add(A[i]);
            b.add(B[i]);
        }
        
        while(!a.isEmpty()){
            answer += a.poll() * b.poll();
        }
        
        // int len = A.length;
        // List<Integer> a = Arrays.stream(A).boxed().collect(Collectors.toList());
        // List<Integer> b = Arrays.stream(B).boxed().collect(Collectors.toList());
        // Collections.sort(a);
        // Collections.sort(b, Collections.reverseOrder());
        // for(int i = 0; i < len; i++){
        //     answer += a.get(i) * b.get(i);
        // }
        return answer;
    }
}