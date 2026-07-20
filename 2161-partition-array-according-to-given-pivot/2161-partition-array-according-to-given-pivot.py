class Solution:
    def pivotArray(self, nums: List[int], pivot: int) -> List[int]:
        l = 0
        r = len(nums)-1
        result = [0]*(len(nums))
        left = []
        right = []
        middle = []
        for i in range(len(nums)):
            if nums[i] < pivot:
                left.append(nums[i])
            elif nums[i] > pivot:
                right.append(nums[i])
            else:
                middle.append(nums[i])
        for i in range(len(nums)):
            if(i < (len(left))):
                result[i] = left[i]
            elif i < (len(left)+len(middle)):
                result[i] = middle[i-len(left)]
            else:
                result[i] = right[i-len(left)-len(middle)]
        return result