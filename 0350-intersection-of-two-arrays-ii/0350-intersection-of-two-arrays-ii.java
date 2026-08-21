class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        HashMap<Integer, Integer> mp = new HashMap<>();

        int i = 0, j = 0;
        int count = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                mp.put(nums1[i], mp.getOrDefault(nums1[i], 0) + 1);
                count++;
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        int[] arr = new int[count];

        i = 0;

        for (int val : mp.keySet()) {
            int freq = mp.get(val);

            for (int k = 0; k < freq; k++) {
                arr[i++] = val;
            }
        }

        return arr;
    }
}