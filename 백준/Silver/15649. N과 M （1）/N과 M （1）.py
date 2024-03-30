import sys

def solution(N, M) :
    dfs()

def dfs() :
    global answer

    if len(answer) == M :
        print(*answer)
        return
    
    for i in range(1, N+1) :
        if i not in answer :
            answer.append(i)
            dfs()
            answer.pop()
    
if __name__ == "__main__" :
    input = sys.stdin.readline
    N, M = map(int, input().split())
    answer = []
    solution(N, M)