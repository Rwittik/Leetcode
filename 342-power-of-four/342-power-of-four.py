class Solution:
    def isPowerOfFour(self, n: int) -> bool:
        return n > 0 and not(n & (n-1)) and (n-1)%3 == 0