def solution(s):
    pCnt = s.count("p") + s.count("P")
    yCnt = s.count("y") + s.count("Y")
    if pCnt == yCnt :
        return True
    else :
        return False