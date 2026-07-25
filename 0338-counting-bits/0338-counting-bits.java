class Solution {
    public int[] countBits(int n) {
        int arr[]=new int[n+1];
        for(int i=0; i<n+1; i++){
            int count=0;
            int num=i;
            while(num>1){
                if(num%2==1)count++;
                num/=2;
            }
            if(num==1)count++;
            arr[i]=count;
        }
        return arr;
    }
}