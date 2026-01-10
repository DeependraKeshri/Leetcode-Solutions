class Solution {
    public String largestGoodInteger(String num) {
        String ans = "";
        for (int i = 0; i <= num.length() - 3; i++) {
            String str = num.substring(i, i + 3);
            if (str.charAt(0) == str.charAt(1) && str.charAt(1) == str.charAt(2)) {
                if (ans.equals("") || str.compareTo(ans) > 0) {
                    ans = str;
                }
            }
        }
        return ans;
    }
}
