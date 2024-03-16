def solution(arr):
    answer = arr
    answer.remove(min(answer))
    return answer if len(answer) else [-1]