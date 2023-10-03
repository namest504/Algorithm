class Solution {
    public int solution(int[][] sizes) {
        int maxW = Integer.MIN_VALUE;
        int maxH = Integer.MIN_VALUE;
        for(int[] size : sizes){
            int max = Math.max(size[0], size[1]);
            int min = Math.min(size[0], size[1]);
            maxW = Math.max(max, maxW);
            maxH = Math.max(min, maxH);
        }
        int answer = maxW * maxH;
        return answer;
    }
}