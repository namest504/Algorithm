def solution(s):
    answer = []
    string = s.split(" ")
    for ss in string :
        for j in range(len(ss)) :
            if j % 2 :
                answer.append(ss[j].lower())
            else :
                answer.append(ss[j].upper())
        answer.append(' ')
    return "".join(answer)[0:-1]