class Solution {
    public int reverseDegree(String s) {
        int count=0;
        for(int i=0; i<s.length(); i++){
            int val=Math.abs('z'-s.charAt(i)+1);
            count+=(val*(i+1));
        }
        return count;
    }
}