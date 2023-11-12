class Solution {
  public int maxProduct(int[] nums) {
    int maxPr=1;
    int res=nums[0] ;
    int minPr=1;
    for(int i=0; i<nums.length; i++)
    {
      if(res < nums[i])
      {
        res = nums[i];
      }
    }

    for(int i=0;i<nums.length;i++){
      if (nums[i]==0){
        maxPr=1;
        minPr=1;
      }
      maxPr=Math.max(nums[i]*maxPr, Math.max(nums[i]*minPr,nums[i]));
      minPr=Math.min(maxPr*nums[i], Math.min(nums[i]*minPr,nums[i]));
      if (res<maxPr){
        res=maxPr;
      }
    }
    return res;
  }
}
