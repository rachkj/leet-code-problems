
//https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

func lengthOfLongestSubstring(s string) int {
    res:=0
    for i:=0; i<len(s); i++ {
        length:= 0
        set:= make(map[byte]bool)
        for j := i; j < len(s); j++ {
            if set[s[j]] == true {
                break
            }
            set[s[j]]=true
            length++
        }
        if res<length{
            res=length
        }
    }
    return res
}
