class Solution {
    public String reverseByType(String s) {
        StringBuilder sbs=new StringBuilder();
        StringBuilder sbc=new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            int val=ch-'a';
            if(val>=0 && val<=25){
                sbc.append(ch);
            }else{
                sbs.append(ch);
            }
        }
        sbc.reverse();
        sbs.reverse();
        int j=0, k=0;
        String str="";
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            int val=ch-'a';
            if(val>=0 && val<=25){
                str+=sbc.charAt(j++);
            }else{
                str+=sbs.charAt(k++);
            }
        }
        return str;
    }
}