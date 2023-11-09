class Solution {
    public int maxProfit(int[] prices) {
       int min_price=prices[0];
       int max_prof=0;

       for(int i=1;i<prices.length;i++){
           max_prof=Math.max(max_prof,prices[i]-min_price);
           min_price=Math.min(min_price, prices[i]);
       }
       return max_prof;
    }
}

// Time complexity: O(n)
// The algorithm iterates through the array of stock prices once, performing constant-time operations at each step. Therefore, the time complexity is linear in the size of the input array.

// Space complexity: O(1)
// The algorithm uses a constant amount of extra space to store variables like min_price and maxprof. The space complexity remains constant regardless of the size of the input array.
