import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
		long[] dp = new long[1001];
		dp[1] = 1;
		dp[2] = 3;
		for(int i = 3; i < n+1; i++){
		    dp[i] = (dp[i-1] + 2*dp[i-2]) % 10007;
		}
		System.out.print(dp[n]);
	}
}