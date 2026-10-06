class Solution {
    public boolean isUgly(int n) {
        if(n==1)return true;
        if(n<1)return false;
        HashSet<Integer> factors=new HashSet<>();
        while (n % 2 == 0) {
            factors.add(2);
            n /= 2;
        }
        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        if (n > 2) {
            factors.add(n);
        }
        factors.remove(2);
        factors.remove(3);
        factors.remove(5);
        return factors.size()==0;
    }
}