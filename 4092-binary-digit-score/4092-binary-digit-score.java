class Solution {
    public int calculateScore(int a, int b) {
        int ca=0, cb=0;
        while(a>0){
            if(a%2==1)ca++;
            a/=2;
        }
        while(b>0){
            if(b%2==1)cb++;
            b/=2;
        }
        if(ca>=cb)return ca*cb;
        return cb/ca;
    }
}