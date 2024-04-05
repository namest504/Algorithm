import sys
input = sys.stdin.readline

arr = [500, 100, 50, 10, 5, 1]

change = 1000 - int(input())
cnt = 0

for i in arr :
    cnt += change // i
    change %= i
print(cnt)