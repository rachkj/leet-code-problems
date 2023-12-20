class Solution {
    public int countSubstrings(String s) {
        int res=0,l,r;

        for(int i=0;i<s.length();i++){
            l=r=i;
            while (l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                res++;
                l--;
                r++;
            }


            l=i;
            r=i+1;
            while (l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                res++;
                l--;
                r++;
            }
        }
        return res;
    }
}
