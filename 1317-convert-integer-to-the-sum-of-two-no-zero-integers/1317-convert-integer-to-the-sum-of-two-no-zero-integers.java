import java.util.*;

class Solution {
    public int[] getNoZeroIntegers(int n) {
        for (int i = 1; i < n; i++) {
            String val1 = String.valueOf(i);
            String val2 = String.valueOf(n - i);

            if (!val1.contains("0") && !val2.contains("0")) {
                return new int[]{i, n - i};
            }
        }
        return new int[0];
    }
}
