class Solution {
    public int totalMoney(int n) {
        int m=1, e=0;
        int totMoney=0;
        for(int i=0; i<n; i++){
            if(i%7==0){
                totMoney+=m;
                m++;
                e=m;
            }else{
                totMoney+=e;
                e++;
            }
        }
        return totMoney;
    }
}