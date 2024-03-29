class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> comb=new HashSet<>();
        for(int i=0;i<nums.length-2;i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                    ArrayList<Integer> s = new ArrayList<>();
                    s.add(nums[i]);
                    s.add(nums[j]);
                    s.add(nums[k]);

                    comb.add(s);
                    j++;
                } else if (sum<0){
                    j++;
                } else {
                    k--;
                }
            }
        }
        return new ArrayList<>(comb);
    }
}
