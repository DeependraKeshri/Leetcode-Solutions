class Solution {
    public int totalMoney(int n) {
        int sum=0, val=0, num=0, curr=0;
        while(num<n){
            if(num%7==0){
                curr++;
                val=curr;
                sum+=val;
            }else{
                val++;
                sum+=val;
            }
            num++;
        }
        return sum;
    }
}