class Solution {
    public String convertDateToBinary(String date) {
        String s="";
        int i=0;
        for(int j=0; j<date.length(); j++){
            if(date.charAt(j)=='-'){
                String str=Integer.toBinaryString(Integer.parseInt(date.substring(i,j)));
                i=j+1;
                s+=str+'-';
            }
        }
        s+=Integer.toBinaryString(Integer.parseInt(date.substring(i)));
        return s;
    }
}