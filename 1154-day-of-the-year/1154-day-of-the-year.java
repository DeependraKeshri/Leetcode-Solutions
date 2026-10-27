class Solution {
    public int dayOfYear(String date) {
        int year=0, month=0, dates=0, days=0,c=3;
        int arr[]={0,31,28,31,30,31,30,31,31,30,31,30};
        for(int i=1; i<12; i++){
            arr[i]+=arr[i-1];
        }
        for(int i=0; i<date.length(); i++){
            char ch=date.charAt(i);
            if(ch=='-')c--;
            else if(c==3){
                year=year*10+(ch-'0');
            }else if(c==2){
                month=month*10+(ch-'0');
            }else if(c==1){
                dates=dates*10+(ch-'0');
            }
        }
        int ans=0;
        if(month>0)ans+=arr[month-1];
        ans+=dates;
        if(((year%400==0) || (year%4==0 && year%100!=0)) && month>2)ans++;
        return ans;
    }
}