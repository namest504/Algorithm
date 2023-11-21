import java.util.*;

class Solution {
    static HashMap<String, Integer> hMap = new HashMap<>();
    
    public String solution(String[] survey, int[] choices) {
        initHashMap();
        
        int times = survey.length;
        
        for(int i = 0; i < times; i++){
            String type1 = survey[i].split("")[0];
            String type2 = survey[i].split("")[1];
            int choice = choices[i];
            
            calcChoice(type1, type2, choice);
        }
        return buildPersonality();
    }
    
    private void initHashMap(){
        String[] str = {"R","T","C","F","J","M","A","N"};
        for(String s : str){
            hMap.put(s, 0);
        }
    }
    
    private void calcChoice(String type1, String type2, int choice){
        switch(choice){
            case 1:
                hMap.put(type1, hMap.get(type1) + 3);
                break;
            case 2:
                hMap.put(type1, hMap.get(type1) + 2);
                break;
            case 3:
                hMap.put(type1, hMap.get(type1) + 1);
                break;
            case 4:
                break;
            case 5:
                hMap.put(type2, hMap.get(type2) + 1);
                break;
            case 6:
                hMap.put(type2, hMap.get(type2) + 2);
                break;
            case 7:
                hMap.put(type2, hMap.get(type2) + 3);
                break;
            default:
                break;
        }
    }
    
    private String buildPersonality(){
        StringBuilder sb = new StringBuilder();
        
        if(hMap.get("T") > hMap.get("R")) sb.append("T");
        else sb.append("R");
        
        if(hMap.get("F") > hMap.get("C")) sb.append("F");
        else sb.append("C");
        
        if(hMap.get("M") > hMap.get("J")) sb.append("M");
        else sb.append("J");
        
        if(hMap.get("N") > hMap.get("A")) sb.append("N");
        else sb.append("A");
        
        return sb.toString();
    }
}