class Solution {
    public int minOperations(String s) {
        int c=0, count=0;
        for(int i=0; i<s.length(); i++){
            if(i%2==0){
                if(s.charAt(i)=='1')c++;
                else count++;
            }else{
                if(s.charAt(i)=='1')count++;
                else c++;
            }
        }
        return Math.min(c,count);
    }
}