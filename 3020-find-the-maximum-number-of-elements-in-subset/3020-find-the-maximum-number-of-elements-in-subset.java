class Solution {
    public int maximumLength(int[] nums) {
        HashMap<Integer, Integer> mp=new HashMap<>();
        int max=Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
            if(max<nums[i])max=nums[i];
        }
        int count=0;
        for(int i:mp.keySet()){
            int c=0;
            int j=i;
            while(j<=max){
                if(mp.containsKey(j)){
                    int fre=mp.get(j);
                    if(j==1){
                        if(fre%2==0)c=fre-1;
                        else c=fre;
                        break;
                    }
                    if(fre==1){
                        c++;
                        break;
                    }else{
                        j*=j;
                        if(mp.containsKey(j))c+=2;
                        else c++;
                    }
                }else{
                    break;
                }
            }
            if(count<c)count=c;
        }
        return count;
    }
}