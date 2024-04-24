public class Solution {

    public int tribonacci(int n) {
        if (n < 0 || n > 37) {
            throw new IllegalArgumentException("n must be between 0 and 37 (inclusive)");
        }

        // Initialize the first three terms (corrected for T1)
        int t0 = 0;
        int t1 = 1; // Corrected T1 value
        int t2 = 1;

        // Calculate the remaining terms using the recurrence relation
        for (int i = 3; i <= n; i++) {
            int t3 = t0 + t1 + t2;
            t0 = t1;
            t1 = t2;
            t2 = t3;
        }

        return n == 0 ? t0 : (n == 1 ? t1 : t2);  // Handle first two terms directly
    }
}
