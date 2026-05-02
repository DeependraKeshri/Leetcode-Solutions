class Solution {
    public int rotatedDigits(int n) {
        int count=0;
        for(int i=1; i<=n; i++){
            String num=Integer.toString(i);
            int numb=0;
            boolean valid=true;
            for(int j=0; j<num.length(); j++){
                char ch=num.charAt(j);
                numb*=10;
                if(ch=='0' || ch=='1' || ch=='8'){
                    numb+=(ch-'0');
                }else if(ch=='2'){
                    numb+=5;
                }else if(ch=='5'){
                    numb+=2;
                }else if(ch=='6'){
                    numb+=9;
                }else if(ch=='9'){
                    numb+=6;
                }else{
                    valid=false;
                    break;
                }
            }
            if(valid && numb!=i){
                count++;
            }
        }
        return count;
    }
}