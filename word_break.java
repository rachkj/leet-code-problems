class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Boolean[] dp = new Boolean[s.length()+1];
        Arrays.fill(dp,false);
        dp[s.length()]=true;
        for(int i=s.length()-1;i>=0;i--){
            for(String w:wordDict){
                if((i+w.length()<=s.length()) && (s.substring(i,i+w.length()).equals(w))){
                    dp[i]=dp[i+w.length()];
                }
                if (dp[i]==true) {
                    break;
                }
            }
        }
        return dp[0];
    }
}
