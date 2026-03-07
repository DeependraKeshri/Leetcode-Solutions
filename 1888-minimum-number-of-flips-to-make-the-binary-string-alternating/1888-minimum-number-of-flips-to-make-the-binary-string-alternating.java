class Solution {
    public int minFlips(String s) {
        int n = s.length();
        String str = s + s;

        StringBuilder st1 = new StringBuilder();
        StringBuilder st2 = new StringBuilder();

        for(int i = 0; i < str.length(); i++){
            if(i % 2 == 0){
                st1.append('0');
                st2.append('1');
            }else{
                st1.append('1');
                st2.append('0');
            }
        }

        int diff1 = 0, diff2 = 0;
        int l = 0;
        int ans = Integer.MAX_VALUE;

        for(int r = 0; r < str.length(); r++){
            if(str.charAt(r) != st1.charAt(r)) diff1++;
            if(str.charAt(r) != st2.charAt(r)) diff2++;

            if(r - l + 1 > n){
                if(str.charAt(l) != st1.charAt(l)) diff1--;
                if(str.charAt(l) != st2.charAt(l)) diff2--;
                l++;
            }

            if(r - l + 1 == n){
                ans = Math.min(ans, Math.min(diff1, diff2));
            }
        }

        return ans;
    }
}