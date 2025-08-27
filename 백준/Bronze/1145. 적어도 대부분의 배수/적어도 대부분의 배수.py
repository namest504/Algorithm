import math
import sys
from itertools import combinations
from typing import List


class Solution:
    def __init__(self, a: List[int]):
        self.a:List[int] = a

    def lcm(self, x, y) -> int:
        return x * y // math.gcd(x, y)

    def solve(self) -> int:
        result = float("inf")
        for comb in combinations(self.a, 3):
            val = self.lcm(comb[0], comb[1])
            val = self.lcm(val, comb[2])
            if val < result:
                result = val
        return result

if __name__ == "__main__":
    a = list(map(int, sys.stdin.readline().split()))
    sol = Solution(a)
    print(sol.solve())