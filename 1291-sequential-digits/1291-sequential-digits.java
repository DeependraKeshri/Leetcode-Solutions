class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list = new ArrayList<>();
        int minLen = String.valueOf(low).length();
        int maxLen = String.valueOf(high).length();
        for (int len = minLen; len <= maxLen; len++) {
            for (int start = 1; start <= 10 - len; start++) {
                int num = 0;
                for (int d = start; d < start + len; d++) {
                    num = num * 10 + d;
                }
                if (num >= low && num <= high) {
                    list.add(num);
                }
            }
        }
        return list;
    }
}