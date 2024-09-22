class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> pascal = new ArrayList<>();
        for(int i = 0 ; i <= rowIndex ; i++){
            List<Integer> row = new ArrayList<>();
            for(int j = 0; j <= i ; j++){
                if(i == j || j == 0){
                    row.add(1);
                } else {
                    List<Integer> prev = pascal.get(i-1);
                    row.add(prev.get(j) + prev.get(j-1));
                }
            }
            pascal.add(row);
        }
        List<Integer> ans = pascal.get(rowIndex);
        return ans;
    }
}