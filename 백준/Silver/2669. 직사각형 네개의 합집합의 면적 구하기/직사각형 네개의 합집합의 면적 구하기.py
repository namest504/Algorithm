import sys
input = sys.stdin.readline

board = [[0 for _ in range(100)] for _ in range(100)]
for _ in range(4) :
    x1, y1, x2, y2 = map(int, input().split())
    for x in range(x1, x2) :
        for y in range(y1, y2) :
            board[y][x] = 1

answer = 0
for i in range(100) :
    answer += sum(board[i])
print(answer)