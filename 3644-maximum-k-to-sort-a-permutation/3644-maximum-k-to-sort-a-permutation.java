class Solution {
    public int sortPermutation(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(i!=nums[i]){
                ans=nums[i];
                break;
            }
        }

         for(int i=0;i<nums.length;i++){
            if(i!=nums[i]){
                ans=ans & nums[i];
            }
        }
        return ans;
    }
}