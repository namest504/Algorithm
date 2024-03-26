word = input()
answer = []
for i in range(1, len(word)-1) :
    for j in range(i+1, len(word)) :
        first = word[:i][::-1]
        second = word[i:j][::-1]
        third =  word[j:][::-1]
        answer.append(first + second + third)
print(min(answer))