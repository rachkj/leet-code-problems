// https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

class Solution {
  public int lengthOfLongestSubstring(String s) {
    int res=0;
    for (int i=0;i<s.length();i++){
      int len=0;
      Set<Character> set=new HashSet<Character>();
      for(int j=i;j<s.length();j++){
        if(set.contains(s.charAt(j))){
          break;
        }
        set.add(s.charAt(j));
        len++;
      }
      if (res<len){
        res=len;
      }
    }
    return res;
  }
}
