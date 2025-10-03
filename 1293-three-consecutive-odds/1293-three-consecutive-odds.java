class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
      for(int i=0; i<arr.length; i++){
        if(arr[i]%2==1){
        int j=0;
        while(j<3 && i<arr.length-2){
            if(arr[i+j]%2==0)break;
            j++;
        }
        if(j==3)return true;
        }
      } 
      return false; 
    }
}