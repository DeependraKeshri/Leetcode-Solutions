class Solution {
    public int[] findEvenNumbers(int[] digits) {
       Set<Integer> set = new HashSet<>();
        int n = digits.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (i != j && j != k && i != k) {
                        int first = digits[i];
                        int second = digits[j];
                        int third = digits[k];
                        if (first != 0 && third % 2 == 0) {
                            int num = first * 100 + second * 10 + third;
                            set.add(num);
                        }
                    }
                }
            }
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        return list.stream().mapToInt(Integer::intValue).toArray(); 
    }
}