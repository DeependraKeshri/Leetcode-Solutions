class Solution {
    public String convertDateToBinary(String date) {
        String ans="";
        String val="";
        for(int i=0; i<date.length(); i++){
            char ch=date.charAt(i);
            if(ch=='-'){
                int v=Integer.parseInt(val);
                val="";
                ans+=Integer.toBinaryString(v);
                ans+="-";
            }else{
                val+=ch;
            }
        }
        int v=Integer.parseInt(val);
        ans+=Integer.toBinaryString(v);
        return ans;
    }
}