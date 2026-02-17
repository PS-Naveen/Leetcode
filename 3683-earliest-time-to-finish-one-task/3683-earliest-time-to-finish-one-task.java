class Solution {
    public int earliestTime(int[][] tasks) {
        int min = -1;
        for(int i = 0 ; i < tasks.length ; i++){
            if(min == -1)   min = tasks[i][0] + tasks[i][1];
            if(tasks[i][0] + tasks[i][1] < min) min = tasks[i][0] + tasks[i][1];
        }
        return min;
    }
}