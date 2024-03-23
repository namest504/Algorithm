S = input()
answer = ''

for s in S :
    if s.islower() :
        s = ord(s) + 13
        if chr(s) > 'z' :
            s -= 26
        answer += chr(s)
    elif s.isupper() :
        s = ord(s) + 13
        if chr(s) > 'Z' :
            s -= 26
        answer += chr(s)
    else :
        answer += s
print(answer)