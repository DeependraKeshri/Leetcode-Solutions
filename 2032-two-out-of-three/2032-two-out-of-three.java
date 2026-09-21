class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashMap<Integer, Integer> mp=new HashMap<>();
        for(int ele:nums1){
            if(!mp.containsKey(ele))mp.put(ele, 1);
        }
        HashSet<Integer> set=new HashSet<>();
        for(int ele:nums2){
            if(!set.contains(ele)){
                if(mp.containsKey(ele))mp.put(ele, 2);
                else mp.put(ele,1);
                set.add(ele);
            }
        }
        set.clear();
        for(int ele:nums3){
            if(!set.contains(ele)){
                if(mp.containsKey(ele))mp.put(ele, 2);
                set.add(ele);
            }
        }
        List<Integer> list=new ArrayList<>();
        for(int ele:mp.keySet()){
            if(mp.get(ele)>=2)list.add(ele);
        }
        return list;
    }
}