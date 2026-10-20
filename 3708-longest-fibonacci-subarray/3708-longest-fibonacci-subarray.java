class Solution {
    public int longestSubarray(int[] nums) {
        int count=0;
        int max=0;
        for(int i=0;i<nums.length-2;i++){
          if(nums[i]+nums[i+1]==nums[i+2]){
            count++;
            max=Math.max(max,count);
          }
          else{
            max=Math.max(max,count);
            count=0;
          }
        }
        return max+2;
    }
}