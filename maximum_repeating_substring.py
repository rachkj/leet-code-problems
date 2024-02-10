class Solution:
    def maxRepeating(self, sequence: str, word: str) -> int:
        if len(word) > len(sequence):
            return 0
        count=0
        counter=1
        while(word*counter in sequence):
            count+=1
            counter+=1
        return count
