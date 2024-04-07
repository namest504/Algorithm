import sys
input = sys.stdin.readline
n = int(input())
for i in range(1, n+1) :
    text = input().rstrip()
    print(f"{i}. {text}")