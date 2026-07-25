class Solution {
    public int maxProduct(int n) {
        int arr[]=new int[10];
        while(n>0){
            int val=n%10;
            arr[val]++;
            n/=10;
        }
        int first=Integer.MIN_VALUE, second=Integer.MIN_VALUE;
        for(int i=9; i>=0; i--){
            if(arr[i]>1){
                if(first==Integer.MIN_VALUE)return i*i;
                else return first*i;
            }
            else if(arr[i]==1){
                if(first==Integer.MIN_VALUE)first=i;
                else{
                    second=i;
                    break;
                }
            }
        }
        return first*second;
    }
}