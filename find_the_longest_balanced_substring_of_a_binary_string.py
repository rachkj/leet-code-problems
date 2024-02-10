class Solution:
    def findTheLongestBalancedSubstring(self, s: str) -> int:
        temp="01"
        result=0

        while(temp in s):
            result=len(temp)
            temp="0"+temp+"1"
        return result
