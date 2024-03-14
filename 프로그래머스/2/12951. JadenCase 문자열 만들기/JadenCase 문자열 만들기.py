def solution(s):
    answer = []
    for word in s.split(" ") :
        if(word) :
            answer.append(word[0].upper() + word[1:].lower())
        else :
            answer.append(word)
    return " ".join(answer)