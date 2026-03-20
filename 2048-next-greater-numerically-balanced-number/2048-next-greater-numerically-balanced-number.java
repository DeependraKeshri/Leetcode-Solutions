class Solution {
    public int nextBeautifulNumber(int n) {
        n++;
        while(true){
            int arr[]=new int[10];
            int num=n;
            while(num>0){
                arr[num%10]++;
                num/=10;
            }
            boolean val=true;
            for(int i=0; i<10; i++){
                if(arr[i]!=0 && arr[i]!=i){
                    val=false;
                    break;
                }
            }
            if(val)return n;
            n++;
        }
    }
}