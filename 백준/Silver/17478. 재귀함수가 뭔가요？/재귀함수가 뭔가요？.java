import java.util.*;
public class Main {
    
    private static String prefix = "____";
    private static String str1 = "\"재귀함수가 뭔가요?\"\n";
    private static String str2 = "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n";
    private static String str3 = "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n";
    private static String str4 = "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\n";

    private static String str5 = "라고 답변하였지.\n";
    
    private static String str6 = "\"재귀함수는 자기 자신을 호출하는 함수라네\"\n";

    private static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
        recursion(0);
    }
    
    private static void recursion(int depth){
        if(depth >= N) {
            for(int i = 0; i < depth; i++){
                System.out.print(prefix);
            }
            System.out.print(str1);
            for(int i = 0; i < depth; i++){
                System.out.print(prefix);
            }
            System.out.print(str6);
            for(int i = 0; i < depth; i++){
                System.out.print(prefix);
            }
            System.out.print(str5);
            return;
        } else {
            for(int i = 0; i < depth; i++){
                System.out.print(prefix);
            }
            System.out.print(str1);
            for(int i = 0; i < depth; i++){
                System.out.print(prefix);
            }
            System.out.print(str2);
            for(int i = 0; i < depth; i++){
                System.out.print(prefix);
            }
            System.out.print(str3);
            for(int i = 0; i < depth; i++){
                System.out.print(prefix);
            }
            System.out.print(str4);
            recursion(depth + 1);
            for(int i = 0; i < depth; i++){
                System.out.print(prefix);
            }
            System.out.print(str5);
        }
    }
}