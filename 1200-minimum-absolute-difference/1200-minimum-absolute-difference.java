class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> list= new ArrayList<>();
        Arrays.sort(arr);
        int diff=Integer.MAX_VALUE;
        for(int i=0; i<arr.length-1; i++){
            int d=arr[i+1]-arr[i];
            if(d<diff)diff=d;
        }
        for(int i=0; i<arr.length-1; i++){
            int d=arr[i+1]-arr[i];
            if(d==diff){
                List<Integer> l=new ArrayList<>(List.of(arr[i],arr[i+1]));
                list.add(l);
            }
        }
        return list;
    }
}