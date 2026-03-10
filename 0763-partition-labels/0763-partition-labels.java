class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> list=new ArrayList<>();
        int arr[]=new int[26];
        for(int i=0; i<s.length(); i++){
            arr[s.charAt(i)-'a']=i;
        }
        int i=0, j=-1, index=0;
        while(i<s.length()){
            if(arr[s.charAt(i)-'a']>j)j=arr[s.charAt(i)-'a'];
            if(i==j){
                list.add(i-index+1);
                index=i+1;
            }
            i++;
        }

        return list;

    }
}