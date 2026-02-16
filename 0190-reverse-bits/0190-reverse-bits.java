class Solution {
    public int reverseBits(int n) {
        StringBuilder sb=new StringBuilder(Integer.toBinaryString(n));
        while (sb.length() < 32) {
            sb.insert(0, '0');
        }
        int s=0, e=sb.length()-1;
        while(s<e){
            char f=sb.charAt(s);
            char l=sb.charAt(e);
            sb.setCharAt(s,l);
            sb.setCharAt(e,f);
            s++;
            e--;
        }
        String str=sb.toString();
        int val= Integer.parseInt(str,2);
        return val;
    }
}