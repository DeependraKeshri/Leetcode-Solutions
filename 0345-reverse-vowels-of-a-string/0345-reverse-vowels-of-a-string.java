class Solution {
    public String reverseVowels(String s) {
        int st=0, e=s.length()-1;
        StringBuilder sb=new StringBuilder(s);
        String helper="aeiouAEIOU";
        HashSet<Character> set=new HashSet<>();
        for(int i=0; i<helper.length(); i++){
            set.add(helper.charAt(i));
        }
        while(st<e){
            char ch1=s.charAt(st);
            char ch2=s.charAt(e);
            if(set.contains(ch1) && set.contains(ch2)){
                sb.setCharAt(st,ch2);
                sb.setCharAt(e,ch1);
                st++;
                e--;
            }else if(!set.contains(ch1) && !set.contains(ch2)){
                st++;
                e--;
            }else if(set.contains(ch1))e--;
            else st++;
        }
        return sb.toString();
    }
}