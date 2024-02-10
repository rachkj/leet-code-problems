class Solution:
    def maxLengthBetweenEqualCharacters(self, s: str) -> int:
        maxi=-1
        for left in range(len(s)):
            for right in range(left+1,len(s)):
                if s[left]==s[right]:
                    maxi=max(maxi,right-left-1)
        return maxi
