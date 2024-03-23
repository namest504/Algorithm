T = int(input())

for i in range(T) :
    para = list(map(str, input().split()))
    result = []
    for j in para :
        print(j[::-1], end=' ')
    print()