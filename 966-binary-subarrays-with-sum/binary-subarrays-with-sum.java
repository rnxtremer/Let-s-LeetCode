class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count = 0;
        int prefixSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); 

        for (int num : nums) {
            prefixSum += num;
            int targetSum = prefixSum - goal;
            if (map.containsKey(targetSum)) {
                count += map.get(targetSum);
            }
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }
}