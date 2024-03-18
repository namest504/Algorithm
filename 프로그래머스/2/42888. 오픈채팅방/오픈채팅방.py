def solution(record):
    user = {}
    result = []
    rec = [r.split(" ") for r in record]
    
    for r in rec :
        if r[0] == "Enter" :
            user[r[1]] = r[2]
        elif r[0] == "Change" :
            user[r[1]] = r[2]
    
    for r in rec :
        if r[0] == "Enter" :
            result.append('%s님이 들어왔습니다.' %user[r[1]])
        elif r[0] == "Leave" :
            result.append('%s님이 나갔습니다.' %user[r[1]])

    return result