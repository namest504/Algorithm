import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> arr = new ArrayList<>();
        
        for(int i = 0 ; i < n ; i++){
            arr.add(Integer.parseInt(br.readLine()));
        }
        
        int leftHeight = 0;
        int leftCount = 0;
        
        for(int i = 0; i < n; i++){
            if(leftHeight < arr.get(i)){
                leftHeight = arr.get(i);
                leftCount++;
            }
        }
        
        int rightHeight = 0;
        int rightCount = 0;
        
        for(int i = n-1; i >= 0; i--){
            if(rightHeight < arr.get(i)){
                rightHeight = arr.get(i);
                rightCount++;
            }
            
        }

        System.out.println(leftCount);
        System.out.println(rightCount);
    }
}