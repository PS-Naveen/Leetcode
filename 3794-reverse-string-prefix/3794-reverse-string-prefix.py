class Solution:
    def reversePrefix(self, s: str, k: int) -> str:
        n = len(s)
        if k == 1:
            return s
        first = s[0:k]
        rev = first[::-1]
        second = s[k:n]
        return rev+second
        