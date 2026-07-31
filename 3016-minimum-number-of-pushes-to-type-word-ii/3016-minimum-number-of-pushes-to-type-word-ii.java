class Solution {
    public int minimumPushes(String word) {
        int n=word.length();
        int arr[]=new int[26];
        for(int i=0; i<n; i++){
            int idx=word.charAt(i)-'a';
            arr[idx]++;
        }
        int ans=0;
        Arrays.sort(arr);
        int i=25, count=1;
        while(i>=0){
            int sum=0;
            for(int j=i; j>=0 && j>i-8; j--){
                if(arr[j]==0)break;
                sum+=arr[j];
            }
            ans+=(count*sum);
            count++;
            if(i>=0 && arr[i]==0)break;
            i-=8;
        }
        return ans;
    }
}