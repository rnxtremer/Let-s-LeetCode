class Solution {
    public boolean isSameAfterReversals(int num) {
        int reversed1 = reverseNumber(num);
        int reversed2 = reverseNumber(reversed1);
        return reversed2 == num;
    }
    
    private int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return reversed;
    }
}
