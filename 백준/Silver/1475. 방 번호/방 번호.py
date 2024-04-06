import sys
input = sys.stdin.readline
n = int(input())
rooms =[0 for _ in range(10)]
while n > 0 :
    num = n % 10
    if num == 6 or num == 9 :
        if rooms[6] <= rooms[9] :
            rooms[6] += 1
        else :
            rooms[9] += 1
    else :
        rooms[num] += 1
    n //= 10
print(max(rooms))
