class Solution {
    public int numSub(String s) {
        long count = 0;
        long curr = 0;
        int mod = 1000000007;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                curr++;                   
                count = (count + curr) % mod; 
            } else {
                curr = 0;                
            }
        }
        return (int) count;
    }
}
