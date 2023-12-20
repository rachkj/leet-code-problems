class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        
        for(int i=0;i<strs.length;i++){
        String s1= strs[i];
            char[] arr = s1.toCharArray();
            Arrays.sort(arr);
            String sortedString = new String(arr);

            if(map.containsKey(sortedString)){
                map.get(sortedString).add(s1);
            } else {
                map.put(sortedString, new ArrayList<>());
                map.get(sortedString). add(s1);
            }
        }   
        return new ArrayList<>(map.values());
    }
}
