class Solution:
    def isAnagram(s: str, t: str) -> bool:

        # s=sorted(s)
        # t=sorted(t)
        # return s==t

        if len(s) != len(t):
            return False
        
        for i in s:
            if s.count(i) != t.count(i):
                return False
        return True
    
    print(isAnagram("anagram","mgrnaaa"))
            
