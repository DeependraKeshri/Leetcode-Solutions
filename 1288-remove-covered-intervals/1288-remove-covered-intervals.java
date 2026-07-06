class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int n=intervals.length;
        boolean arr[]=new boolean[n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(j!=i && !arr[j]){
                    if(intervals[i][0]<=intervals[j][0] && intervals[j][1]<=intervals[i][1])arr[j]=true;
                }
            }
        }
        int count=0;
        for(int i=0; i<n; i++){
            if(arr[i])count++;
        }
        return intervals.length-count;
    }
}