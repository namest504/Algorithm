import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    HashSet<Integer> set = new HashSet<>();
    
    for(int i = 0; i < 10 ; i++){
      int input = Integer.parseInt(br.readLine());
      set.add(input % 42);
    }

    System.out.print(set.size());
  }
}