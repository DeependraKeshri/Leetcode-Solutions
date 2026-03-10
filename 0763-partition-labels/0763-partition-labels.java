class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> list=new ArrayList<>();
        HashMap<Character, Integer> mp=new HashMap<>();
        for(int i=0; i<s.length(); i++){
            mp.put(s.charAt(i),i);
        }
        int i=0, j=-1, index=0;
        while(i<s.length()){
            int idx=mp.get(s.charAt(i));
            if(idx>j)j=idx;
            if(i==j){
                list.add(i-index+1);
                index=i+1;
            }
            i++;
        }
        return list;
    }
}