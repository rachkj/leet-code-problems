class Solution {
    public int getSum(int a, int b) {
        // Do a XOR b (returns 0 for 1,1 and 0,0 and return 1 for 1,0 and 0,1). 
        // This does not consider carry over, so do a&b and left shift it by 1 so the carry over is in correct place for the binaries. 
        // Do this until the carry over become 0. using a variable tmp to ensure that the updated value of a is nt use for &.
        while(b!=0){
            int tmp=(a&b)<<1;
            a=a^b;
            b=tmp;
        }
        return a;
    }
}
