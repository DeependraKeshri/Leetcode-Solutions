import java.util.HashMap;

class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int[] d : dominoes) {
            // make a canonical key
            int a = Math.min(d[0], d[1]);
            int b = Math.max(d[0], d[1]);
            int key = a * 10 + b; // since values are between 1–9

            // if key already exists, add its current count to result
            count += map.getOrDefault(key, 0);

            // update frequency
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        return count;
    }
}
