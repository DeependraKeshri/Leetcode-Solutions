class Solution {
    public String smallestPalindrome(String s) {
        int n=s.length();
        int arr[]=new int[26];
        for(int i=0; i<n; i++){
            int ch=s.charAt(i)-'a';
            arr[ch]++;
        }
        int st=0, e=n-1;
        char ans[]=new char[n];
        int val=-1;
        for(int i=0; i<26; i++){
            int size=arr[i];
            if(size%2==1){
                val=i;
                size--;
            }
            char ch=(char)(i+'a');
            while(size>0){
                ans[st++]=ch;
                ans[e--]=ch;
                size-=2;
            }
        }
        if(val!=-1)ans[st]=(char)('a'+val);
        return new String(ans);
    }
}