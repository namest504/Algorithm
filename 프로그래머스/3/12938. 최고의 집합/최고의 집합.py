def solution(n, s):
    answer = []
    for i in range(n) :
        if s // n == 0 :
            return [-1]
        answer.append(s // n)
        
    for i in range(s % n) :
        answer[i] += 1
    answer.sort()
    return answer