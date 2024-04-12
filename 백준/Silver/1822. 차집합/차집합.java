/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Set<Integer> setA = new HashSet<>();
		Set<Integer> setB = new HashSet<>();
		String[] line = br.readLine().split(" ");
		int nA = Integer.parseInt(line[0]);
		int nB = Integer.parseInt(line[1]);
		
		line = br.readLine().split(" ");
		for(String l : line){
		    setA.add(Integer.parseInt(l));
		}
		
		line = br.readLine().split(" ");
		for(String l : line){
		    setB.add(Integer.parseInt(l));
		}
		
		int count = 0;
		List<Integer> answer = new ArrayList<>();
		for(Integer i : setA){
		    if(!setB.contains(i)){
		        count++;
		        answer.add(i);
		    }
		}
		
		System.out.println(answer.size());
		if(answer.size() != 0){
		    Collections.sort(answer);
		    for(Integer a : answer){
		        System.out.print(a + " ");
		    }
		}
	}
}