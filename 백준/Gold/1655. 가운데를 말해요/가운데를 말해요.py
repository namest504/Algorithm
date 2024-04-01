import sys
import heapq
input = sys.stdin.readline

N = int(input())
lh = []
rh = []

for _ in range(N) :
    num = int(input())

    if len(lh) == len(rh)  :
        heapq.heappush(lh, -num)
    else :
        heapq.heappush(rh, num)

    if rh and (-lh[0]) > rh[0] :
        left = heapq.heappop(lh)
        right = heapq.heappop(rh)

        heapq.heappush(rh, -left)
        heapq.heappush(lh, -right)
    print(-lh[0])