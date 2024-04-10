import sys
input = sys.stdin.readline
n, m = map(int, input().split())

dic = {}
for _ in range(n) :
    line = list(map(str, input().rstrip().split()))
    dic[line[0]] = line[1]

for _ in range(m) :
    site = input().rstrip()
    print(dic[site])