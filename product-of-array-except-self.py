class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n=len(nums)
        outArray=[0]*n
        prefix=1
        postfix=1
        for i in range(n):
            outArray[i]=prefix
            prefix=prefix*nums[i]
        
        for i in range(n-1,-1,-1):
            outArray[i]=outArray[i]*postfix
            postfix=postfix*nums[i]

        return outArray
