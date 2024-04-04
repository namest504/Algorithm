import sys
input = sys.stdin.readline

N = int(input())
dp = [0 for _ in range(N+1)]
sche = [list(map(int, input().split())) for _ in range(N)]

for i in range(N-1, -1, -1) :
    if i + sche[i][0] > N :
        dp[i] = dp[i+1]
    else :
        dp[i] = max(dp[i+1], dp[i+sche[i][0]] + sche[i][1])

print(dp[0])