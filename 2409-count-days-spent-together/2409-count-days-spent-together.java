class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int arr[]={0,31,28,31,30,31,30,31,31,30,31,30};
        for(int i=1; i<12; i++){
            arr[i]+=arr[i-1];
        }
        int asm=0, asd=0, aem=0, aed=0, bsm=0, bsd=0, bem=0, bed=0;
        for(int i=0; i<arriveAlice.length(); i++){
            if(i==2)continue;
            else if(i<2){
                asm=asm*10+arriveAlice.charAt(i)-'0';
                aem=aem*10+leaveAlice.charAt(i)-'0';
                bsm=bsm*10+arriveBob.charAt(i)-'0';
                bem=bem*10+leaveBob.charAt(i)-'0';
            }else{
                asd=asd*10+arriveAlice.charAt(i)-'0';
                aed=aed*10+leaveAlice.charAt(i)-'0';
                bsd=bsd*10+arriveBob.charAt(i)-'0';
                bed=bed*10+leaveBob.charAt(i)-'0';
            }
        }
        int sa=arr[asm-1]+asd, la=arr[aem-1]+aed, sb=arr[bsm-1]+bsd, lb=arr[bem-1]+bed;
        int ans=0;
        if(sa<=sb && lb<=la){
            ans=lb-sb+1;
        }else if(sa<=sb && lb>la && sb<=la){
            ans=la-sb+1;
        }else if(sa>sb && lb<=la && lb>=sa){
            ans=lb-sa+1;
        }else if(sa>sb && lb>la){
            ans=la-sa+1;
        }
        return ans;
    }
}