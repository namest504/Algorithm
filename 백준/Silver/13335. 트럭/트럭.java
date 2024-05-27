import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException{
	    
	    // init input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
	    int n = Integer.parseInt(st.nextToken());
	    int w = Integer.parseInt(st.nextToken());
	    int L = Integer.parseInt(st.nextToken());
	    
	    int[] a = new int[n];
	    
	    st = new StringTokenizer(br.readLine(), " ");
	    
	    for(int i = 0; i < n; i++){
	        a[i] = Integer.parseInt(st.nextToken());
	    }
	    
	    // solution
	    Queue<Integer> bridge = new LinkedList<>();
	    
	    int currentWeight = 0;
	    int time = 0;
	    for(int truck : a){
	        while(true){
	            if(bridge.isEmpty()){
	                bridge.add(truck);
	                currentWeight += truck;
	                time++;
	                break;
	            } else {
	                if(bridge.size() == w){
	                    currentWeight -= bridge.poll();
	                } else if(currentWeight + truck > L) {
	                    bridge.add(0);
	                    time++;
	                } else {
	                    bridge.add(truck);
	                    currentWeight += truck;
	                    time++;
	                    break;
	                }
	            }
	        }
	    }
	    System.out.print(time + w);
	}
}