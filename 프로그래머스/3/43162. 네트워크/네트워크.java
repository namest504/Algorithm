import java.util.*;
class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visit = new boolean[n];
        
        Queue<Integer> que = new LinkedList<>();
        for(int j = 0; j < computers.length; j++){
            if(!visit[j]){
                answer++;
                que.offer(j);
                visit[j] = true;
                while(!que.isEmpty()){
                    int now = que.poll();
                    for(int i = 0; i < computers[now].length; i++){
                        if(i != now && computers[now][i] == 1 && !visit[i]){
                            que.offer(i);
                            visit[i] = true;
                        }
                    }
                }
            }
        }
        return answer;
    }
}