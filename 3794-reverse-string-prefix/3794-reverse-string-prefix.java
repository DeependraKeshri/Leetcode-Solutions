class Solution {
    public String reversePrefix(String s, int k) {
        int e=k-1;
        String str="";
        while(e>-1){
            str+=s.charAt(e);
            e--;
        }
        str+=s.substring(k);
        return str;
    }
}