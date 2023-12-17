class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int len = nums.length;
        int num = 0;
        int count = 0;
        for(int i = 0; i < len-2; i++){
            for(int j = i+1; j < len-1; j++){
                for(int k = j+1; k < len; k++){
                    num = nums[i]+nums[j]+nums[k];
                    count = 0;
                    for(int h = 1; h <= num; h++){
                        if(num % h == 0) count++;
                    }
                    if(count == 2) answer++;
                }
            }
        }

        return answer;
    }
}