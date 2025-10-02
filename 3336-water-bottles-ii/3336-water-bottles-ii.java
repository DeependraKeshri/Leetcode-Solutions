class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int count = 0;
        int empBot = 0;

        while (numBottles > 0 || empBot >= numExchange) {
            if (numBottles > 0) {
                count += numBottles;
                empBot += numBottles;
                numBottles = 0;
            } else if (empBot >= numExchange) {
                empBot -= numExchange;
                numExchange++;
                numBottles = 1;
            }
        }
        return count;
    }
}
