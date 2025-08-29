import sys
from typing import List

def calc(base: float, case: str) -> float:
    if(case == '@'):
        return base * 3
    if (case == '%'):
        return base + 5
    if (case == '#'):
        return base - 7

T = int(sys.stdin.readline())

for i in range(T):
    line: List[str] = list(map(str, sys.stdin.readline().split()))
    value: float = float(line[0])

    for l in line[1:]:
        value = calc(value, l)
    print("{:.2f}".format(value))
