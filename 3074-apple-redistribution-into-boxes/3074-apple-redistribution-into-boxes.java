class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int tot=0;
        for(int i=0; i<apple.length; i++){
            tot+=apple[i];
        }
        Arrays.sort(capacity);
        int count=0;
        for(int i=capacity.length-1; i>=0; i--){
            tot-=capacity[i];
            count++;
            if(tot<=0)break;
        }
        return count;
    }
}