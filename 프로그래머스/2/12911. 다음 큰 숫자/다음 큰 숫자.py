def solution(n):
    answer = 0
    cnt = getBin(n)
    while True :
        n += 1
        if cnt == getBin(n) :
            answer = n
            break;
    return answer

def getBin(num) :
    return str(bin(num)[2:]).count("1")