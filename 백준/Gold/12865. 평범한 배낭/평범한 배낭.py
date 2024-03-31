import sys
input = sys.stdin.readline

N, K = map(int, input().split())

items = []

for _ in range(N) :
    W, V = map(int, input().split())
    items.append((W,V))

dp = [0 for _ in range(K+1)]

for item in items :
    W, V = item
    for i in range(K, W-1, -1) :
        dp[i] = max(dp[i], dp[i-W]+V)
print(dp[-1])