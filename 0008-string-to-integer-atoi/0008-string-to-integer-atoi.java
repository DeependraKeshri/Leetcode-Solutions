class Solution {
    public int myAtoi(String s) {
        long ans = 0;
        boolean sign = false;
        boolean valid = true;
        int i = 0;
        while(i < s.length() && s.charAt(i) == ' '){
            i++;
        }
        if(i < s.length() && s.charAt(i) == '-'){
            sign = true;
            i++;
        }else if(i < s.length() && s.charAt(i) == '+'){
            i++;
        }
        while(i < s.length()){
            char ch = s.charAt(i);
            if(ch < '0' || ch > '9') break;
            ans = ans * 10 + (ch - '0');
            if(!sign && ans > Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(sign && -ans < Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            i++;
        }
        if(sign) ans = -ans;
        return (int)ans;
    }
}