class Solution {
    public int reverse(int x) {
        int reversed = 0;
        int sign = x < 0 ? -1 : 1;  
        x = Math.abs(x);             

        while (x > 0) {
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && x % 10 > 7)) {
                return 0; 
            }

            int lastDigit = x % 10;
            reversed = reversed * 10 + lastDigit;
            x /= 10;
        }

        return reversed * sign;
    }
}
