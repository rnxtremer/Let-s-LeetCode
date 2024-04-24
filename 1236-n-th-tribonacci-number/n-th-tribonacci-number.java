public class Solution {

    public int tribonacci(int n) {
        if (n < 0 || n > 37) {
            throw new IllegalArgumentException("n must be between 0 and 37 (inclusive)");
        }

        int t0 = 0;
        int t1 = 1; 
        int t2 = 1;

        for (int i = 3; i <= n; i++) {
            int t3 = t0 + t1 + t2;
            t0 = t1;
            t1 = t2;
            t2 = t3;
        }

        return n == 0 ? t0 : (n == 1 ? t1 : t2); 
    }
}
