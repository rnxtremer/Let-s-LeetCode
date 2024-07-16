class Solution {
  public boolean containsNearbyDuplicate(int[] nums, int k) {
    Map<Integer, Integer> seen = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int num = nums[i];
      if (seen.containsKey(num) && Math.abs(i - seen.get(num)) <= k) {
        return true;
      }
      seen.put(num, i);
    }
    return false;
  }
}
