class Solution {
    public String convertDateToBinary(String date) {
        String arr[]=date.split("-");
        StringBuilder sb=new StringBuilder();
        for(int i=0; i<arr.length; i++){
            String s=Integer.toBinaryString(Integer.parseInt(arr[i]));
            if(i==arr.length-1){
                sb.append(s);
            }else{
                sb.append(s+'-');
            }
        }
        return sb.toString();
    }
}