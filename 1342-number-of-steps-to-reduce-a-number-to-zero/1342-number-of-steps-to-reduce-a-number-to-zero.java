class Solution {
    public int numberOfSteps(int num) {
        int count=0;
        while(num>0){
            if((num & 1) == 0) num >>= 1;
            else num=num & (num-1);
            count++;
        }
        return count;
    }
}