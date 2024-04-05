import sys
input = sys.stdin.readline

N = int(input())
flowers = []
for _ in range(N) :
    a, b, c, d = list(map(int, input().split()))
    flowers.append([a * 100 + b, c * 100 + d])
flowers.sort(key=lambda x:(x[0], x[1]))

cnt = 0
start = 301
end = 0

while flowers :
    if start < flowers[0][0] or start > 1130 :
        break

    for i in range(len(flowers)) :
        if start >= flowers[0][0] :
            if end <= flowers[0][1] :
                end = flowers[0][1]
            flowers.remove(flowers[0])
        else :
            break
    start = end
    cnt += 1

if start <= 1130 :
    print(0)
else :
    print(cnt)