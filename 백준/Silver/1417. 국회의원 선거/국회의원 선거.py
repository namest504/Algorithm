N = int(input())
ds = int(input())
others = [int(input()) for _ in range(N-1)]

cnt = 0
while others and max(others) >= ds :
    max_votes = max(others)
    idx = others.index(max_votes)
    others[idx] -= 1
    ds += 1
    cnt += 1

print(cnt)