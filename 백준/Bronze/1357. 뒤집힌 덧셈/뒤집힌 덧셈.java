import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
		
		System.out.println(rev(rev(x) + rev(y)));
	}
	
	private static int rev(int num){
        int result = 0;
        
        while(num > 0){
            result = result*10 + num%10;
            num /= 10;
        }
        return result;
    }
}