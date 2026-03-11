class Solution {
    public int bitwiseComplement(int n) {
        if(n==0)return 1;
        int num=n;
        int i=0;
        while(i<31){
            int val=1<<i;
            if(val>n)break;
            num=num^val;
            i++;
        }
        return num;
    }
}