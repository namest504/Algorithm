class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for(String sTree : skill_trees){
            sTree = sTree.replaceAll("[^" + skill + "]", "");
            
            for(int i = 0; i < skill.length() + 1; i++){
                String sub = skill.substring(0, i);
                if(sTree.equals(sub)){
                    answer++;
                    break;
                }
            }
        }
        
        return answer;
    }
}