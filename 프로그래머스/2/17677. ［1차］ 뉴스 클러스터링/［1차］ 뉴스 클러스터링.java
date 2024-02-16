import java.util.*;
class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        Map<String, Integer> m1 = toMap(str1);
        Map<String, Integer> m2 = toMap(str2);
        Set<String> sameKey = getSameKey(m1, m2);
        List<String> denominatorList = getDenominatorSet(m1, m2, sameKey);
        List<String> numeratorList = getNumeratorList(m1, m2, sameKey);
        
        if(denominatorList.size() == 0) {
            return 65536;
        } else {
            return (int)((((double)numeratorList.size() / (double)denominatorList.size())) * 65536);
        }
    }
    
    private List<String> getNumeratorList(Map<String, Integer> m1, Map<String, Integer> m2, Set<String> sameKey){
        for(String key : m1.keySet()){
            sameKey.add(key);
        }
        for(String key : m2.keySet()){
            sameKey.add(key);
        }
        
        List<String> numerator = new ArrayList<>();
        int i1, i2;
        for(String s : sameKey){
            i1 = m1.getOrDefault(s, 0);
            i2 = m2.getOrDefault(s, 0);
            
            if(i1 != 0 || i2 != 0){
                for(int i = 0; i < Math.min(i1, i2); i++){
                    numerator.add(s);
                }
            } 
        }
        return numerator;
    }
    
    private List<String> getDenominatorSet(Map<String, Integer> m1, Map<String, Integer> m2, Set<String> sameKey){
        List<String> denominator = new ArrayList<>();
        
        int i1, i2;
        for(String s : sameKey){
            i1 = m1.getOrDefault(s, 0);
            i2 = m2.getOrDefault(s, 0);
            
            for(int i = 0; i < Math.max(i1, i2); i++){
                denominator.add(s);
            }
        }
        return denominator;
    }
    
    private Set<String> getSameKey(Map<String, Integer> m1, Map<String, Integer> m2){
        Set<String> sameKey = new HashSet<>();
        for(String key : m1.keySet()){
            sameKey.add(key);
        }
        for(String key : m2.keySet()){
            sameKey.add(key);
        }
        return sameKey;
    }
    
    private Map<String, Integer> toMap(String s){
        Map<String, Integer> result = new HashMap<>();
        StringBuilder sb;
        String[] stringArray = s.split("");
        
        for(int i = 0; i < s.length() - 1; i++){
            sb = new StringBuilder();
            if(isAlpha(stringArray[i]) && isAlpha(stringArray[i+1])) {
                sb.append(stringArray[i].toUpperCase()).append(stringArray[i+1].toUpperCase());
                result.put(sb.toString(), result.getOrDefault(sb.toString(), 0) + 1);
            }
        }
        return result;
    }
    
    private boolean isAlpha(String s){
        for(char c : s.toCharArray()){
            if(!Character.isLetter(c)){
                return false;
            }
        }
        return true;
    }
}