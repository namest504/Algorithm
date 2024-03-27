def solution(square) :
    answer = 0
    for i in range(len(square)) :
        for j in range(len(square[0])) :
            answer = max(answer, find_point(square, i, j))
    print(answer)
    
def find_point(sq, i, j) :
    result = 0
    start = sq[i][j]
    x, y = i, j
    
    while x < len(sq) and y < len(sq[0]) :
        if start == sq[x][y] and start == sq[i][y] and start == sq[x][j] :
            result = max(result, calc(i, j, x, y))
            
        x += 1
        y += 1
    return result

def calc (i, j, x, y) :
     return ((x-i)+1) * ((y-j)+1)
    
if __name__ == "__main__" :
    N, M = map(int, input().split())
    square = []
    for i in range(N) :
        square.append(list(input()))
    solution(square)