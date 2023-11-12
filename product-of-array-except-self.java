// Create three arrays to store prefix, postfix and output. The initial prefix  will be 1 for the first element and initial postfix for the last element will be 1. Loop from start to end, set prefix as the value in the prefixArray and then get new prefix. Do similar approach for postfixArray. 
// The output will be prefix array into postfix array for each position.
// Time Complexity: O(n) Space Complexit: O(n)

class Solution {
    public int[] productExceptSelf(int[] nums) {
    int[] preArray = new int[nums.length];
    int[] postArray = new int[nums.length];
    int[] outArray = new int[nums.length];
    int prefix = 1;
    int postfix = 1;
    for (int i = 0; i < nums.length; i++) {
      preArray[i] = prefix;
      prefix = prefix * nums[i];
    }
    for (int i = nums.length - 1; i >= 0; i--) {
      postArray[i] = postfix;
      postfix = postfix * nums[i];
      outArray[i] = postArray[i] * preArray[i];
    }
    return outArray;
  }
}

// Reduce space complexity by writing everything a single array.
class Solution {
    public int[] productExceptSelf(int[] nums) {
    int[] outArray = new int[nums.length];
    int prefix = 1;
    int postfix = 1;
    for (int i = 0; i < nums.length; i++) {
      outArray[i] = prefix;
      prefix = prefix * nums[i];
    }
    for (int i = nums.length - 1; i >-1; i--) {
      outArray[i] = outArray[i]*postfix;
      postfix = postfix * nums[i];
    }
    return outArray;
  }
}
