chart = {"A+": 4.5, "A0": 4.0, "B+": 3.5, "B0": 3.0, "C+": 2.5, "C0": 2.0, "D+": 1.5, "D0": 1.0, "F": 0.0}

credit = 0
grade = 0
for i in range(20) :
    val = list(map(str, input().split()))
    if val[2] != "P" :
        credit += float(val[1])
        grade += float(val[1]) * float(chart[val[2]])
print(round(grade/credit, 6))