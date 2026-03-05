class Solution {
    public int maxFreqSum(String s) {
        int arr[]=new int[26];
        for(int i=0; i<s.length(); i++){
            arr[s.charAt(i)-'a']++;
        }
        int maxvow=0, maxcon=0;
        for(int i=0; i<26; i++){
            if(i==0 || i==4 || i==8 || i==14 || i==20){
                if(maxvow<arr[i])maxvow=arr[i];
            }else{
                if(maxcon<arr[i])maxcon=arr[i];
            }
        }
        return maxvow+maxcon;
    }
}