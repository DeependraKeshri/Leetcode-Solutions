class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration,
                                  int[] waterStartTime, int[] waterDuration) {
        int total = Integer.MAX_VALUE;
        int m = landStartTime.length;
        int n = waterStartTime.length;
        int land[] = new int[m];
        int water[] = new int[n];
        for (int i = 0; i < m; i++) {
            land[i] = landStartTime[i] + landDuration[i];
        }
        for (int i = 0; i < n; i++) {
            water[i] = waterStartTime[i] + waterDuration[i];
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                total = Math.min(
                    total,
                    Math.max(land[i], waterStartTime[j]) + waterDuration[j]
                );
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                total = Math.min(
                    total,
                    Math.max(water[i], landStartTime[j]) + landDuration[j]
                );
            }
        }
        return total;
    }
}