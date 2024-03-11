class Solution {
    public String customSortString(String order, String s) {
        int[] charCount = new int[26]; 

        for (char c : s.toCharArray()) {
            charCount[c - 'a']++;
        }

        StringBuilder result = new StringBuilder();
        for (char c : order.toCharArray()) {
            for (int i = 0; i < charCount[c - 'a']; i++) {
                result.append(c);
            }
            charCount[c - 'a'] = 0;
        }

        for (char c = 'a'; c <= 'z'; c++) {
            for (int i = 0; i < charCount[c - 'a']; i++) {
                result.append(c);
            }
        }

        return result.toString();
    }
}
