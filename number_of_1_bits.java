public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count=0;
        while (n!=0) {
        // Time limit exceeeds. Logic: Mod 2 will return 1 if the number ends with 1 and 0 if the number ends with zero. Add this to the count to count the 1's. Right right operator after each count.
              // count+=n%2;
             // n=n>>1;

        // Faster code: eg: n=101 n-1=100 n&(n-1)=100, count=1. n=100 , n-1=011 n&(n-1)=000 , count =2
            n=n&(n-1);
            count++;
        }
        return count;
    }
}
