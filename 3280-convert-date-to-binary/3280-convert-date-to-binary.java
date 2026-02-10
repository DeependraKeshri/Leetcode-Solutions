class Solution {
    public String convertDateToBinary(String date) {
        String ans="";
        int j=0;
        for(int i=0; i<date.length(); i++){
            if(date.charAt(i)=='-'){
                int v=Integer.parseInt(date.substring(j,i));
                j=i+1;
                ans+=Integer.toBinaryString(v);
                ans+="-";
            }
        }
        int v=Integer.parseInt(date.substring(j));
        ans+=Integer.toBinaryString(v);
        return ans;
    }
}