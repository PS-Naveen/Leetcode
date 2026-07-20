class Solution:
    def shiftGrid(self, grid: List[List[int]], k: int) -> List[List[int]]:
        m = len(grid)
        n = len(grid[0])
        for i in range(k):
            result = [[0] * n for _ in range(m)]
            for j in range(m):
                for l in range(n):
                    if(j == m-1 and l == n-1):
                        result[0][0] = grid[m-1][n-1]
                    elif(l == n-1):
                        result[j+1][0] = grid[j][l]
                    else:
                        result[j][l+1] = grid[j][l]
            grid = result
        return grid