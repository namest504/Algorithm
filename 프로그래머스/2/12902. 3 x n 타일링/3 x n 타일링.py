def solution(n):
    dp = [0, 3, 11]
    # f(2n) = 3 * f(2n - 2) + 2 ( f(2n-4) + f(2n-6) + .... ) + 2
    # f(n) = 3 * f(n - 1) + 2 ( f(n-2) + f(n-3) + .... ) + 2
    for i in range(3, n+1):
        dp.append((3*dp[i-1] + 2*sum(dp[:i-1]) + 2) % 1000000007)
    return dp[n//2] 
        