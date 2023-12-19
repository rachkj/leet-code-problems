class Solution {
    public boolean isAnagram(String s, String t) {
      // Anagram is where the characters in both match: eg: rat, tar. 
      // Return false if length doesnt match.
        if (s.length()!=t.length()){
            return false;
        }
      // Create a hasmap to store the char and count of char in the fisrt string.
        HashMap<Character, Integer> map=new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
      // Iterate through second string and decremet the char count when the char is found, remove the char if count is 1 and if char not found, return false.
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            if (map.containsKey(ch)==false){
                return false;
            } else if (map.get(ch)==1){
                map.remove(ch);
            } else {
                map.put(ch,map.get(ch)-1);
            }

        }
        return (map.size()==0);
    }
}
