import java.util.*;
class Solution {
    private int[] parent;
    public int solution(int n, int[][] computers) {
        parent = new int[n];
        
        for(int i = 0; i < n; i++){
            parent[i] = i;
        }
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i != j && computers[i][j] == 1){
                    union(i, j);
                }
            }
        }
        
        Set<Integer> result = new HashSet<>();
        for(int i = 0; i < n; i++){
            result.add(find(i));
        }
        
        return result.size();
    }
    
     public void union(int a, int b) {
        a = find(a);
        b = find(b);
        if(a < b) {
            parent[b] = a;
        } else {
            parent[a] = b;
        }
    }
    
    public int find(int a) {
        if(parent[a] == a) {
            return a;
        } else {
            return parent[a] = find(parent[a]);
        }
    }
}