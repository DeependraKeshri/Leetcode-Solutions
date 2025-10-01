class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int count=0, empBot=numBottles;
        while(numBottles>0){
            count+=numBottles;
            numBottles=empBot/numExchange;
            empBot=(empBot/numExchange)+(empBot%numExchange);
        }
        return count;
    }
}