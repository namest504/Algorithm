import sys

def solution(A, B, C) :
    print(pow(A, B, C))
    
if __name__ == "__main__" :
    A, B, C = map(int, input().split())
    solution(A,B,C)