def soluiton(times, names, records) :
    rec = {}
    for i in range(2 * len(names) - 1) :
        r = records[i].split()
        rec[r[0]] = rec.get(r[0], 0) + 1

    for r in rec :
        if rec[r] == 1 :
            print(times, names[int(r) - 1])

    
if __name__ == "__main__" :
    times = 1
    
    while True :  
        n = int(input())
        if n == 0 :
            break
        names = [input() for _ in range(n)]
        records = [input() for _ in range(2*n - 1)]
        soluiton(times, names, records)
        times += 1