class Solution {
    public String reverseVowels(String s) {
        int st=0, e=s.length()-1;
        StringBuilder sb=new StringBuilder(s);
        String helper="aeiouAEIOU";
        while(st<e){
            char ch1=s.charAt(st);
            char ch2=s.charAt(e);
            if(helper.indexOf(ch1)!=-1 && helper.indexOf(ch2)!=-1){
                sb.setCharAt(st,ch2);
                sb.setCharAt(e,ch1);
                st++;
                e--;
            }else if(helper.indexOf(ch1)==-1 && helper.indexOf(ch2)==-1){
                st++;
                e--;
            }else if(helper.indexOf(ch1)!=-1)e--;
            else st++;
        }
        return sb.toString();
    }
}