import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        String strCase = "";
        for(int i = 0; i < s.length(); i++){
            strCase = s.substring(i, s.length()) + s.substring(0, i);
            if(isRight(strCase)){
                answer++;
            }
        }
        System.out.println(isRight(s));
        return answer;
    }
    
    private boolean isRight(String str){
        Stack<String> stack = new Stack<>();
        
        for(String s : str.split("")){
            if(s.equals("{") || s.equals("[") || s.equals("(")){
                stack.add(s);
            } else {
                if(!stack.isEmpty()){
                    if(s.equals("}")) {
                        if(stack.peek().equals("{")){
                            stack.pop();
                        } else {
                            return false;
                        }
                    } else if(s.equals("]")) {
                        if(stack.peek().equals("[")){
                            stack.pop();
                        } else {
                            return false;
                        }
                    } else if(s.equals(")")) {
                        if(stack.peek().equals("(")){
                            stack.pop();
                        } else {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            }
        }
        
        if(stack.isEmpty()) return true;
        else return false;
    }
}