class Solution(object):
    def sortedSquares(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        squared_nums = [num * num for num in nums]  
        squared_nums.sort()  
        return squared_nums
        