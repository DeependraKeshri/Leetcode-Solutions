class Solution {
    public int smallestNumber(int n, int t) {
        int num=n;
        while(num<Integer.MAX_VALUE){
            int number=num;
            int prod=1;
            while(number>0){
                prod*=(number%10);
                number/=10;
            }
            if(prod%t==0)return num;
            num++;
        }
        return -1;
    }
}