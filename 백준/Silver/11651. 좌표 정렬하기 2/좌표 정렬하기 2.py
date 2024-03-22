T = int(input())

pos = []
for i in range(T) :
    pos.append(list(map(int, input().split())))

pos.sort(key= lambda x : (x[1], x[0]))

for i in pos :
    print(*i)