class Solution {
    public boolean isPalindrome(String s) {
        String res="";
        for(char c: s.toCharArray()){
            if(Character.isDigit(c)|| Character.isLetter(c)){
                res+=c;
            }
        }
            res=res.toLowerCase();

            int a_ptr=0;
            int b_ptr=res.length()-1;
            while(a_ptr<=b_ptr){
                if (res.charAt(a_ptr)!=res.charAt(b_ptr)){
                    return false;
                }
                a_ptr+=1;
                b_ptr-=1;
            }
        return true;
    }
}
