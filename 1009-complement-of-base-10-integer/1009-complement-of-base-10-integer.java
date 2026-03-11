class Solution {
    public int bitwiseComplement(int n) {
        String str=Integer.toBinaryString(n);
        String s="";
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='1')s+='0';
            else s+='1';
        }
        int num=Integer.parseInt(s,2);
        return num;
    }
}