class Solution {
    public int maxScore(String s) {
        int one=0;
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(ch=='1')one++;
        }
        int lz=0, ans=Integer.MIN_VALUE;
        for(int i=0; i<s.length()-1; i++){
            char ch=s.charAt(i);
            if(ch=='0'){
                lz++;
            }else{
                one--;
            }
            if(lz+one>ans){
                ans=lz+one;
            }
        }
        return ans;
    }
}