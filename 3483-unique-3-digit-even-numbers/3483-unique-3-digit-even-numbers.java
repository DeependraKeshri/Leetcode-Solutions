class Solution {
    HashSet<Integer> set = new HashSet<>();
    public void helper(int[] digits, boolean[] used, int num, int len) {
        if(len == 3){
            if(num % 2 == 0) set.add(num);
            return;
        }
        for(int i = 0; i < digits.length; i++){
            if(used[i]) continue;
            if(len == 0 && digits[i] == 0) continue;
            used[i] = true;
            helper(digits, used, num*10 + digits[i], len+1);
            used[i] = false;
        }
    }
    public int totalNumbers(int[] digits) {
        helper(digits, new boolean[digits.length], 0, 0);
        return set.size();
    }
}