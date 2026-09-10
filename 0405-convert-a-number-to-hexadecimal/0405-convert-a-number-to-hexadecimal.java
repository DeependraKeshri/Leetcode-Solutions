class Solution {
    public String toHex(int num) {
        if(num == 0) return "0";
        char arr[] = new char[16];
        for(int i = 0; i < 16; i++){
            if(i < 10){
                arr[i] = (char)('0' + i);
            }else{
                arr[i] = (char)('a' + (i - 10));
            }
        }
        long n = num;
        if(num < 0){
            n = (long)Integer.MAX_VALUE + 1 + (long)num;
            n += 2147483648L;
        }
        String s = "";
        while(n > 0){
            int rem = (int)(n % 16);
            s = arr[rem] + s;
            n /= 16;
        }
        return s;
    }
}