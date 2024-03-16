class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        int count = 0; 
        int maxLength = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); 
        for (int i = 0; i < n; i++) {
            count += nums[i] == 1 ? 1 : -1; 

            if (map.containsKey(count)) {
                maxLength = Math.max(maxLength, i - map.get(count));
            } else {
                map.put(count, i);
            }
        }

        return maxLength;
    }
}
