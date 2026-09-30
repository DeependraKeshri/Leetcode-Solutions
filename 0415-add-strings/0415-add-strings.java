class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int len1 = num1.length() - 1;
        int len2 = num2.length() - 1;
        while(len1 >= 0 || len2 >= 0) {
            int val = carry;
            if(len1 >= 0) {
                val += num1.charAt(len1) - '0';
                len1--;
            }
            if(len2 >= 0) {
                val += num2.charAt(len2) - '0';
                len2--;
            }
            if(val >= 10) {
                carry = 1;
                val -= 10;
            } else {
                carry = 0;
            }
            sb.insert(0, (char)('0' + val));
        }
        if(carry == 1) {
            sb.insert(0, '1');
        }
        return sb.toString();
    }
}