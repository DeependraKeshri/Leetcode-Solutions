class Solution {
    public boolean palindrome(int n){
        String str=Integer.toBinaryString(n);
        int s=0, e=str.length()-1;
        while(s<e){
            if(str.charAt(s)!=str.charAt(e))return false;
            s++;
            e--;
        }
        return true;
    }
    public boolean isStrictlyPalindromic(int n) {
        int num=n;
        for(int i=2; i<n-1; i++){
            if(num==0)return false;
            if(!palindrome(num))return false;
            num/=2;
        }
        return true;
    }
}