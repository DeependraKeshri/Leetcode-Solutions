class Solution {
    public int[] findArray(int[] pref) {
        int arr[]=new int[pref.length];
        int xor=0;
        for(int i=0; i<arr.length; i++){
            arr[i]=xor^pref[i];
            xor^=arr[i];
        }
        return arr;
    }
}