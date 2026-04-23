class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int num=nums.length/2;
        int count=0;
        for(int i=0;i<nums.length;i++){
             if(nums[i]<nums[num]){
            count=count+(nums[num]-nums[i]);
          }
         else if(nums[i]>nums[num]){
            count=count+ (nums[i]-nums[num]);
          }
           
        }
        return count;
    }
}