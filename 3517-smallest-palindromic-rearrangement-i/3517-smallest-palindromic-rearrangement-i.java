class Solution {
    public String smallestPalindrome(String s) {
        char arr[]=s.toCharArray();
        Arrays.sort(arr);
        char ch='a';
        int n=s.length();
        int st=0, e=n-1;
        char ans[]=new char[n];
        for(int i=0; i<n; ){
            int j=i;
            while(j<n && arr[j]==arr[i]){
                j++;
            }
            int size=(j-i);
            if(size%2==1){
                ch=arr[i];
                size--;
            }
            int lt=size/2;
            while(lt>0){
                ans[st++]=arr[i];
                ans[e--]=arr[i];
                lt--;
            }
            i=j;
        }
        if(ans[st]=='\u0000')ans[st]=ch;
        return new String(ans);
    }
}