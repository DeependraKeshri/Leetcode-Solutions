class Solution {
    public String convertDateToBinary(String date) {
        String arr[]=date.split("-");
        for(int i=0; i<arr.length; i++){
            arr[i]=Integer.toBinaryString(Integer.parseInt(arr[i]));
        }
        String ans="";
        for(int i=0; i<arr.length; i++){
            ans+=arr[i];
            if(i!=arr.length-1){
                ans+="-";
            }
        }
        return ans;
    }
}