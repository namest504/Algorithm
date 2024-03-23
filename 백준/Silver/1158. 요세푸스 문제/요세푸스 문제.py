N, K = map(int, input().split())
answer = []
arr = [i for i in range(1, N+1)]

idx = 0
for i in range(N) :
    idx += K - 1
    if idx >= len(arr) :
        idx %= len(arr)

    answer.append(str(arr.pop(idx)))
print("<",", ".join(answer),">", sep='')