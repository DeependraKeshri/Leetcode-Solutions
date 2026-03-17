class Solution {
    public int[] findEvenNumbers(int[] digits) {
       Set<Integer> set = new HashSet<>();
        int n = digits.length;
        for (int i = 0; i < n; i++) {
            if(digits[i]!=0){
            for (int j = 0; j < n; j++) {
                if(i!=j){
                for (int k = 0; k < n; k++) {
                    if (j != k && i != k) {
                        int first = digits[i];
                        int second = digits[j];
                        int third = digits[k];
                        int num = first * 100 + second * 10 + third;
                        if (num% 2 == 0 && !set.contains(num)) {
                            set.add(num);
                        }
                    }
                }
                }
            }
            }
        }
        int ans[]=new int[set.size()];
        int i=0;
        for(int val:set){
            ans[i++]=val;
        }
        Arrays.sort(ans);
        return ans;
    }
}