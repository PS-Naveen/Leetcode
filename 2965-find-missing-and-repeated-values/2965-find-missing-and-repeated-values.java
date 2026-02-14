class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] num = new int[2];
        Set<Integer> hs = new HashSet<>();
        for(int i = 0 ; i < grid.length ; i++){
            for(int j = 0 ; j < grid[i].length ; j++){
                if(hs.contains(grid[i][j])){
                    num[0] = grid[i][j];
                } else {
                    hs.add(grid[i][j]);
                }
            }
        }
        int len = hs.size();
        for(int i = 1 ; i <= len+1 ; i++){
            if(!hs.contains(i)){
                num[1] = i;
                return num;
            }
        }
        return num;
    }
}