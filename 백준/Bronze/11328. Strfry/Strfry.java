import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i < n; i++){
		    int[] alphas = new int[26];
		    boolean flag = true;
		    StringTokenizer st = new StringTokenizer(br.readLine());
		    char[] c1 = st.nextToken().toCharArray();
		    for(char c : c1){
		        alphas[c-'a']++;
		    }
		    char[] c2 = st.nextToken().toCharArray();
		    for(char c : c2){
		        alphas[c-'a']--;
		    }
		    for(int a : alphas){
		        if(a != 0){
		            flag = false;
		            break;
		        }
		    }
		    if(flag) System.out.println("Possible");
		    else System.out.println("Impossible");
		}
	}
}