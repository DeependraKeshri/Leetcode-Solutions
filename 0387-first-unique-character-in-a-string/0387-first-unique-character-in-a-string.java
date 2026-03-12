class Solution {
    public int firstUniqChar(String s) {
        char arr[]=s.toCharArray();
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(i!=j && arr[i]==arr[j]){
                    break;
                }
                if(j==arr.length-1)return i;
            }
        }
        return -1;
    }
}