class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration,
                                  int[] waterStartTime, int[] waterDuration) {
        int minLandFinish = Integer.MAX_VALUE;
        int minWaterFinish = Integer.MAX_VALUE;
        int m = landStartTime.length;
        int n = waterStartTime.length;
        for (int i = 0; i < m; i++) {
            minLandFinish = Math.min(
                minLandFinish,
                landStartTime[i] + landDuration[i]
            );
        }
        for (int i = 0; i < n; i++) {
            minWaterFinish = Math.min(
                minWaterFinish,
                waterStartTime[i] + waterDuration[i]
            );
        }
        int ans = Integer.MAX_VALUE;
        for (int j = 0; j < n; j++) {
            int waterFinish = waterStartTime[j] + waterDuration[j];
            ans = Math.min(
                ans,
                Math.max(minLandFinish + waterDuration[j], waterFinish)
            );
        }
        for (int i = 0; i < m; i++) {
            int landFinish = landStartTime[i] + landDuration[i];
            ans = Math.min(
                ans,
                Math.max(minWaterFinish + landDuration[i], landFinish)
            );
        }
        return ans;
    }
}