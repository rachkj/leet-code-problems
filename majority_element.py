class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        majCount=len(nums)//2
        nums.sort()
        return nums[majCount]
