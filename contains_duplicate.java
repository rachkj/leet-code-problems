package img;

 // class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         for(int i=0;i<nums.length-1;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if (nums[i]==nums[j]){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
// }
// O(n2)

// class Solution {
//     public boolean containsDuplicate(int[] nums){
//         Arrays.sort(nums);
//         for(int i=1;i<nums.length;i++){
//             if (nums[i]==nums[i-1])
//                 return true;
//         }
//         return false;
//     }
// }
// O(n log n)

import java.util.HashSet;

class Solution {
  public boolean containsDuplicate(int[] nums){
    HashSet<Integer> seen = new HashSet<>();
    for(int num:nums){
      if (seen.contains(num))
        return true;
      seen.add(num);
    }
    return false;
  }
  // O(n)
}
