class Solution {
    public int binaryGap(int n) {
        String str=Integer.toBinaryString(n);
        int f=0, ans=0;
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i)=='1'){
                int val=(i-f);
                if(val>ans)ans=val;
                f=i;
            }
        }
        return ans;
    }
}