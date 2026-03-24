class Solution {
    public String mapWordWeights(String[] words, int[] weights) {

        StringBuilder ans = new StringBuilder();
        for (String s : words) {
            int cnt = 0;
            for (int i = 0; i < s.length(); i++) {
                cnt += weights[s.charAt(i) - 'a'];
            }
            ans.append((char)('a' + (25 - (cnt % 26))));
        }
        return ans.toString();
    }
}