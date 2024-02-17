class Solution {
    private int answer = 0;
    
    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        
        dfs(0, k, visited, dungeons);
        
        return answer;
    }
    /*
    depth = 현재 진행중인 던전 수, k = 현재 피로도, visited = 방문 여부, dungeons = 던전 맵
    */
    void dfs(int depth, int k, boolean[] visited, int[][] dungeons){
        if(answer < depth){
            answer = depth;
        } 
        
        for(int i = 0; i < dungeons.length; i++){
            if(!visited[i] && dungeons[i][0] <= k){
                visited[i] = true;
                dfs(depth + 1 , k - dungeons[i][1], visited, dungeons);
                visited[i] = false;
            }
        }
    }
}