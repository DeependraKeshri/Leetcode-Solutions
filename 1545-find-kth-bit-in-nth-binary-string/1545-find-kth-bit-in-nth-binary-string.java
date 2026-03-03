class Solution {
    public String reverse(String s){
        return new StringBuilder(s).reverse().toString();
    }
    public String invert(String s){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '0') sb.append('1');
            else sb.append('0');
        }
        return sb.toString();
    }
    public char findKthBit(int n, int k) {
        StringBuilder s = new StringBuilder("0");
        for(int i = 2; i <= n; i++){
            String inverted = invert(s.toString());
            String reversed = reverse(inverted);
            s.append('1').append(reversed);
            if(s.length() >= k)
                s.setLength(k);
        }
        return s.charAt(k - 1);
    }
}