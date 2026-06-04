class Solution {
    public int totalWaviness(int num1, int num2) {
        int count=0;
        for(int i=num1; i<=num2; i++){
            String s=Integer.toString(i);
            if(s.length()>3){
                for(int j=0; j<s.length()-2; j++){
                    count+=helper(s.substring(j,j+3));
                }
            }else if(s.length()==3){
                count+=helper(s);
            }
        }
        return count;
    }
    public int helper(String s){
        int f=s.charAt(0)-'0';
        int m=s.charAt(1)-'0';
        int l=s.charAt(2)-'0';
        if(m<f && m<l)return 1;
        else if(m>f && m>l)return 1;
        return 0;
    }
}