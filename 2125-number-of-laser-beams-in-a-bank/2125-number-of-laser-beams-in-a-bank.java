class Solution {
    public int numberOfBeams(String[] bank) {
        int count=0, a=0, b=0;
        for(int i=0; i<bank.length; i++){
            for(int j=0; j<bank[0].length(); j++){
                if(bank[i].charAt(j)=='1')b++;
            }
            count+=(a*b);
            if(b!=0)a=b;
            b=0;
        }
        return count;
    }
}