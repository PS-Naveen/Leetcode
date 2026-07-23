class Solution:
    def reverseDegree(self, s: str) -> int:
        total = 0
        for i in range(len(s)):
            chr = s[i]
            total = total + ((26 - (ord(chr) - ord('a')))*(i+1))
        return total
        