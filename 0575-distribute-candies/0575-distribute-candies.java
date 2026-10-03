class Solution {
    public int distributeCandies(int[] candyType) {
        int n=candyType.length/2;
        HashSet<Integer> set=new HashSet<>();
        for(int ele:candyType){
            set.add(ele);
        }
        return Math.min(n, set.size());
    }
}