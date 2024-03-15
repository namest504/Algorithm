def solution(s):
    answer = []
    time = 0
    cnt = 0
    
    while s != "1" :
        cnt += s.count("0")
        s = s.replace("0", "")
        s = bin(len(s))[2:]
        time += 1
        
    answer.append(time)
    answer.append(cnt)
    return answer
