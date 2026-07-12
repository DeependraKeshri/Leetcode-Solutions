class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n=arr.length;
        int ans[]=Arrays.copyOf(arr,n);
        Arrays.sort(ans);
        HashMap<Integer, Integer> mp=new HashMap<>();
        int j=1;
        for(int i:ans){
            if(!mp.containsKey(i))mp.put(i,j++);
        }
        for(int i=0; i<n; i++){
            ans[i]=mp.get(arr[i]);
        }
        return ans;
    }
}