import sys
input = sys.stdin.readline
S = int(input())
N = 0
answer = 0

for i in range(1, S+1) :
    N += i
    answer = i
    if N > S :
        answer -= 1
        break
print(answer)