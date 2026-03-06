class Solution {
    public int findPermutationDifference(String s, String t) {
        int arr[]=new int[26];
        int sum=0;
        for(int i=0; i<s.length(); i++){
            arr[s.charAt(i)-'a']=i;
        }
        for(int i=0; i<t.length(); i++){
            sum+=Math.abs(i-arr[t.charAt(i)-'a']);
        }
        return sum;
    }
}