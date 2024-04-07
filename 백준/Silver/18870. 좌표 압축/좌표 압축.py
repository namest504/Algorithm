import sys
input = sys.stdin.readline
n = int(input())
arr = list(map(int, input().split()))

setlist = sorted(set(arr))
dic = {setlist[i] : i for i in range(len(setlist))}

for i in arr :
    print(dic[i], end=" ")