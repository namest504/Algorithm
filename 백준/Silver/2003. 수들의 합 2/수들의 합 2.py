import sys
import pprint
input = sys.stdin.readline
n, m = map(int, input().split())
a = list(map(int, input().split()))
l=0
r=1
answer = 0
while l <= r and r <= n :
    total = sum(a[l:r])
    if total == m :
        answer += 1
        r += 1
    elif total < m :
        r += 1
    else :
        l += 1
print(answer)