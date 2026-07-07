class Solution {
    public long sumAndMultiply(int n) {
        String s=Integer.toString(n);
        long num=0;
        long sum=0;
        for(int i=0; i<s.length(); i++){
            int ch=s.charAt(i)-'0';
            if(ch>0){
                sum+=ch;
                num*=10;
                num+=ch;
            }
        }
        num*=sum;
        return num;
    }
}