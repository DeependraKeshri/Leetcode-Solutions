class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int countLeft=0, countRight=0;
        for(int i=0; i<moves.length(); i++){
            char ch=moves.charAt(i);
            if(ch=='L'){
                countLeft++;
                countRight--;
            }else if(ch=='R'){
                countLeft--;
                countRight++;
            }else{
                countLeft++;
                countRight++;
            }
        }
        countLeft=Math.abs(countLeft);
        countRight=Math.abs(countRight);
        return Math.max(countLeft, countRight);
    }
}