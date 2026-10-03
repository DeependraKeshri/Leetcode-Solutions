class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> mp=new HashMap<>();
        for(int i=0; i<list1.length; i++){
            mp.put(list1[i], i);
        }
        List<String> list=new ArrayList<>();
        for(int i=0; i<list2.length; i++){
            if(mp.containsKey(list2[i])){
                list.add(list2[i]);
                mp.put(list2[i], mp.get(list2[i])+i);
            }
        }
        int s=Integer.MAX_VALUE;
        for(int i=0; i<list.size(); i++){
            s=Math.min(s, mp.get(list.get(i)));
        }
        int count=0;
        for(int i=0; i<list.size(); i++){
            if(mp.get(list.get(i))==s)count++;
        }
        String ans[]=new String[count];
        for(int i=0; i<list.size(); i++){
            if(mp.get(list.get(i))==s)ans[--count]=list.get(i);
        }
        return ans;
    }
}