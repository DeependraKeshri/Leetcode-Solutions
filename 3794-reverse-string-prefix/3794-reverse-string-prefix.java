class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder sb=new StringBuilder(s);
        int f=0, e=k-1;
        while(f<e){
            char fc=sb.charAt(f);
            char lc=sb.charAt(e);
            sb.setCharAt(f,lc);
            sb.setCharAt(e,fc);
            f++;
            e--;
        }
        return sb.toString();
    }
}