class Solution:
    def findLucky(self, arr: List[int]) -> int:
        hashmap = {}
        max = -1
        for i in arr:
            if i not in hashmap:
                hashmap[i] = 1
            else:
                value = hashmap.get(i)
                hashmap[i] = value + 1
        for key, value in hashmap.items():
            if key == value:
                if key > max:
                    max = key
        return max
        