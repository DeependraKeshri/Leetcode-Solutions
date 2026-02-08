class Solution {
    public int maxFreqSum(String s) {
        int arr[]=new int[26];
        for(int i=0; i<s.length(); i++){
            int ch=s.charAt(i)-'a';
            arr[ch]++;
        }
        int vol=0;
        int con=0;
        for(int i=0; i<26; i++){
            if(i==0 || i==4 || i==8 || i==14 || i==20){
                if(vol<arr[i])vol=arr[i];
            }else{
                if(con<arr[i])con=arr[i];
            }
        }
        return vol+con;
    }
}