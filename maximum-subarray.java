// If the sum is negative, reset to 0. And keep updating the maxSum at each iteration.

class Solution {
  public int maxSubArray(int[] nums) {
  int curSum=0;
  int maxSum= nums[0];
  for(int i=0;i<nums.length;i++){
    if (curSum<0){
      curSum=0;
    }
    curSum=curSum+nums[i];
    if (curSum>maxSum){
      maxSum=curSum;
    }
  }
  return maxSum;
  }
}
