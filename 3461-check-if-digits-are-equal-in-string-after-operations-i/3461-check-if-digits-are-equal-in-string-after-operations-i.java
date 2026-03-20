class Solution {
    public boolean hasSameDigits(String s) {
        while(s.length()>2){
            String str="";
            for(int i=0; i<s.length()-1; i++){
                str+=(char)((((s.charAt(i+1)-'0')+(s.charAt(i)-'0'))%10)+'0');
            }
            s=str;
        }
        return s.charAt(0)==s.charAt(1);
    }
}