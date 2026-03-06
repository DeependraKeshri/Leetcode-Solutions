class Solution {
    public int reverseDegree(String s) {
        int arr[]=new int[26];
        int j=26;
        for(int i=0; i<26; i++){
            arr[i]=j--;
        }
        int sum=0;
        for(int i=0; i<s.length(); i++){
            int val=s.charAt(i)-'a';
            sum+=((i+1)*arr[val]);
        }
        return sum;
    }
}