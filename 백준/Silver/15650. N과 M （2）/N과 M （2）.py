import sys
input = sys.stdin.readline

n, m = list(map(int, input().split()))
line = []
def dfs(num) :
    if len(line) == m :
        print(*line)

    for i in range(num, n+1) :
        if i not in line :
            line.append(i)
            dfs(i+1)
            line.pop()
dfs(1)