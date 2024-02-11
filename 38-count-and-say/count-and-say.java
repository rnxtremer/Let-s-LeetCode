class Solution {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }

        StringBuilder result = new StringBuilder();
        String prev = "1";

        for (int i = 2; i <= n; i++) {
            int left = 0, right = 0;
            while (right < prev.length()) {
                while (right < prev.length() && prev.charAt(right) == prev.charAt(left)) {
                    right++;
                }
                result.append(right - left).append(prev.charAt(left));
                left = right;
            }
            prev = result.toString();
            result.setLength(0); 
        }

        return prev;
    }
}
