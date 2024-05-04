class Solution {
    public long wonderfulSubstrings(String word) {
        Map<Integer, Long> map = new HashMap<>();
        map.put(0, 1L);
        int mask = 0;
        long result = 0;

        for(char ch : word.toCharArray()){
            mask ^= (1 << (ch - 'a'));
            result += map.getOrDefault(mask, 0L);

            for(int i = 0; i < 10; i++){
                int maskWithOpenValue = mask ^ (1 << i);
                result += map.getOrDefault(maskWithOpenValue, 0L);
            }
            map.put(mask, map.getOrDefault(mask, 0L) + 1);
        }
        return result;
    }
}