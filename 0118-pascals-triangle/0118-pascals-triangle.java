class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr=new ArrayList<>();
        for(int i=0; i<numRows; i++){
            List<Integer> list=new ArrayList<>();
            for(int j=0; j<=i; j++){
                if(j==0 || j==i)list.add(1);
                else{
                    int val=arr.get(i-1).get(j-1)+arr.get(i-1).get(j);
                    list.add(val);
                }
            }
            arr.add(list);
        }
        return arr;
    }
}