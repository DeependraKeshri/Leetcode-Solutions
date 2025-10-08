
class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        int[] res = new int[n];
        Arrays.sort(potions);  // Sort potions once

        for (int i = 0; i < n; i++) {
            long required = (success + spells[i] - 1) / spells[i]; // ceil(success / spell[i])
            
            int index = binarySearch(potions, required);
            res[i] = potions.length - index;
        }

        return res;
    }

    // Finds first potion >= required using binary search
    private int binarySearch(int[] potions, long required) {
        int left = 0, right = potions.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (potions[mid] < required)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return left;
    }
}
