class Solution:
    def maxArea(self, height: List[int]) -> int:
        res=0
        area=0
        left=0
        right=len(height)-1
        while left<right:
            area=(right-left)* min(height[left],height[right])
            if height[left]<height[right]:
                left+=1
            else:
                right-=1

            if res<area:
                res=area
        return res
