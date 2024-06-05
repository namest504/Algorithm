import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        List<Info> arr = new ArrayList<>();
        StringTokenizer st;
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr.add(new Info(
                st.nextToken(),
                Integer.parseInt(st.nextToken()),
                Integer.parseInt(st.nextToken()),
                Integer.parseInt(st.nextToken())
                )
            );
        }
        
        Collections.sort(arr,
            (o1, o2) -> {
                if(o2.kor == o1.kor){
                    if(o2.eng == o1.eng) {
                        if(o2.math == o1.math) {
                            return o1.name.compareTo(o2.name);
                        } else {
                            return o2.math - o1.math;
                        }
                    } else {
                        return o1.eng - o2.eng;    
                    }
                } else {
                    return o2.kor - o1.kor;   
                }
            }
        );
        
        for(Info i : arr) {
            System.out.println(i.name);
        }
    }
}

class Info {
    String name;
    int kor;
    int eng;
    int math;
    
    public Info(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
}