class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<>();
        set.add(n);
        while(n!=1){
            int val=n, sum=0;
            while(val>0){
                int rem=val%10;
                sum+=(rem*rem);
                val/=10;
            }
            if(set.contains(sum))return false;
            set.add(sum);
            n=sum;
        }
        return true;
    }
}