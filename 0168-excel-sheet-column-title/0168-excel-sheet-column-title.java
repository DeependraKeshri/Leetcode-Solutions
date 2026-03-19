class Solution {
    public String convertToTitle(int columnNumber) {
        String s="";
        int n=columnNumber;
        while(n>0){
            n--;
            char ch=(char)((n%26)+'A');
            s=ch+s;
            n/=26;
        }
        return s;
    }
}