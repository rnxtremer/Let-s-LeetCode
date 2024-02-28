class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()

        total_sum = 0

        for i in range(0, len(nums), 2):
            total_sum += min(nums[i], nums[i + 1])

        return total_sum