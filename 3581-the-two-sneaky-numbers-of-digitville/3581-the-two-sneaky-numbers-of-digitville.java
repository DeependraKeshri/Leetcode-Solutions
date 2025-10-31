class Solution {
    public int[] getSneakyNumbers(int[] nums) {
       HashMap<Integer, Integer>  mp=new HashMap<>();
       for(int i : nums){
        if(!mp.containsKey(i)){
            mp.put(i,1);
        }else{
            mp.put(i,mp.get(i)+1);
        }
       }
       int ans[]=new int[2];
       int j=0;
       for(int i : mp.keySet()){
        if(mp.get(i)>1){
            ans[j]=i;
            j++;
        }
       }
       return ans;
    }
}