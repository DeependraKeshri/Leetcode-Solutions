class Solution {
    public boolean checkIfExist(int[] arr) {
        HashMap<Integer, Integer> mp=new HashMap<>();
        for(int i=0; i<arr.length; i++){
            mp.put(arr[i],i);
        }
        for(int i=0; i<arr.length; i++){
            int val1=2*arr[i];
            if(mp.containsKey(val1) && i!=mp.get(val1))return true;
        }
        return false;
    }
}