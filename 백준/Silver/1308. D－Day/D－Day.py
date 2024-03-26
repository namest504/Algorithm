import datetime

t = list(map(int, input().split()))
d = list(map(int, input().split()))

from_day = datetime.date(t[0], t[1], t[2])
to_day = datetime.date(d[0], d[1], d[2])
d_day = int(str(to_day - from_day).split()[0])

if d_day >= 365243 :
    print("gg")
else:
    print(f"D-{d_day}")