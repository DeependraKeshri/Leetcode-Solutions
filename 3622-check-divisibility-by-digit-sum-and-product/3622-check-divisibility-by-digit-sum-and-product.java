class Solution {
    public boolean checkDivisibility(int n) {
        String str=Integer.toString(n);
        int prod=1, sum=0;
        for(int i=0; i<str.length(); i++){
            int val=str.charAt(i)-'0';
            prod*=val;
            sum+=val;
        }
        sum+=prod;
        return n%sum==0;
    }
}