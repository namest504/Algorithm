import java.util.*;
class Solution {
    public PriorityQueue<Integer> asc = new PriorityQueue<>();
    public PriorityQueue<Integer> desc = new PriorityQueue<>(Collections.reverseOrder());
    
    public int[] solution(String[] operations) {
        for(String operation : operations){
            String[] op = operation.split(" ");
            if(op[0].equals("D")){
                if(asc.isEmpty()){
                    continue;
                }
                if(op[1].equals("-1")){
                    int num = asc.poll();
                    desc.remove(num);
                } else {
                    int num = desc.poll();
                    asc.remove(num);
                }
            }else{
                asc.add(Integer.parseInt(op[1]));
                desc.add(Integer.parseInt(op[1]));
            }
        }
        if(asc.isEmpty()){
            return new int[]{0, 0};
        } else{ 
            return new int[]{desc.poll(), asc.poll()};
        }
    }
}