class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int arr[]=new int[mat.length];
        for(int i=0; i<mat.length; i++){
            int s=0, e=mat[i].length-1;
            while(s<=e){
                int mid=(e+s)/2;
                if(mat[i][mid]==0){
                    e=mid-1;
                }else{
                    s=mid+1;
                }
            }
            arr[i]=s+1;
            mp.put(i,arr[i]);
        }
        Arrays.sort(arr);
        int ans[]=new int[k];
        for(int i=0; i<k; i++){
            int val=0;
            for(int l=0; l<mat.length; l++){
                if(mp.containsKey(l) && arr[i]==mp.get(l)){
                    val=l;
                    mp.remove(l);
                    break;
                }
            }
            ans[i]=val;
        }
        return ans;
    }
}