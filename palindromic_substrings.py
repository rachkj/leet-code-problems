class Solution:
    def countSubstrings(self, s: str) -> int:
        def extend(l:int,r:int)->int:
            count=0
            while (l>=0 and r<len(s) and s[l]==s[r]):
                print(l,r,count)
                count+=1
                l-=1
                r+=1
            return count
    
        palindrome=0
        for i in range(len(s)):
            palindrome+=extend(i,i)
            palindrome+=extend(i,i+1)
        return palindrome
