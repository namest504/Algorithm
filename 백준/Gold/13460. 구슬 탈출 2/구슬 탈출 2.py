import sys

def solution(N, M, board) :
    global que, visit, ry, rx, by, bx
    bfs(ry, rx, by, bx, 1)
    
def bfs(ry, rx, by, bx, depth) :
    global que, visit
    que.append((ry, rx, by, bx, depth))
    visit.append((ry, rx, by, bx))

    while que :
        ry, rx, by, bx, depth = que.pop(0)
        if depth > 10 :
            break
        for i in range(4) :
            nry, nrx, rcnt = move(ry, rx, dy[i], dx[i])
            nby, nbx, bcnt = move(by, bx, dy[i], dx[i])
            if board[nby][nbx] != "O" :
                if board[nry][nrx] == "O" :
                    print(depth)
                    return
                if nry == nby and nrx == nbx :
                    if rcnt > bcnt :
                        nry -= dy[i]
                        nrx -= dx[i]
                    else :
                        nby -= dy[i]
                        nbx -= dx[i]
                if (nry, nrx, nby, nbx) not in visit :
                    visit.append((nry, nrx, nby, nbx))
                    que.append((nry, nrx, nby, nbx, depth + 1))
    print(-1)
                    
def move(y, x, dy, dx) :
    cnt = 0
    while board[y + dy][x + dx] != "#" and board[y][x] != "O" :
        y += dy
        x += dx
        cnt += 1
    return y, x, cnt

def init() :
    global ry, rx, by, bx
    for i in range(N) :
        for j in range(M) :
            if board[i][j] == "R" :
                ry, rx = i, j
            elif board[i][j] == "B" :
                by, bx = i, j
    
if __name__ == "__main__" :
    input = sys.stdin.readline
    ry, rx, by, bx = 0, 0, 0, 0
    que = []
    visit = []
    dx = [1,-1,0,0]
    dy = [0,0,1,-1]
    N, M = map(int, input().split())
    board = [list(input().rstrip()) for _ in range(N)]
    init()
    solution(N, M, board)