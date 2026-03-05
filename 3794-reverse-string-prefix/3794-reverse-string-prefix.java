class Solution {
    public String reversePrefix(String s, int k) {
        String str="";
        for(int i=k-1; i>=0; i--){
            str+=s.charAt(i);
        }
        for(int i=k; i<s.length(); i++){
            str+=s.charAt(i);
        }
        return str;
    }
}