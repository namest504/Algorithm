class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> answer = new ArrayList<>();
        int max = 0;

        for(int candy : candies) {
            max = Math.max(candy, max);    
        }

        for(int candy : candies) {
            if((candy + extraCandies) >= max) {
                answer.add(true);
            } else {
                answer.add(false);
            }
        }

        return answer;
    }
}