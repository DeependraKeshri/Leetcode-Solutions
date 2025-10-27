class Solution {
    public int numberOfBeams(String[] bank) {
        int count=0;
        int first=0;
        for(int i=0; i<bank.length; i++){
            String str=bank[i];
            int sec=0;
            int j=0;
            while(j<str.length()){
                if(str.charAt(j)=='1')sec++;
                j++;
            }
            count+=(first*sec);
            if(sec!=0)first=sec;
        }
        return count;
    }
}