class Solution {
    public int maxProduct(int n) {
        int firstmax=Integer.MIN_VALUE;
        int secondmax=Integer.MIN_VALUE;
        int num=n;
        while(num>0){
            int val=num%10;
            if(val>firstmax)firstmax=val;
            num/=10;
        }
        num=n;
        int count=0;
        while(num>0){
            int val=num%10;
            if(val>secondmax && val!=firstmax){
                secondmax=val;
            }
            if(val==firstmax)count++;
            num/=10;
        }
        if(count>1)secondmax=firstmax;
        return firstmax*secondmax;
    }
}