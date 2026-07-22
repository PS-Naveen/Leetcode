class Solution:
    def countDigitOccurrences(self, nums: list[int], digit: int) -> int:
        count = 0
        target = str(digit)
        for i in nums:
            temp = list(str(i))
            for j in range(len(temp)):
                if(temp[j] == target):
                    count+=1
        return count

        