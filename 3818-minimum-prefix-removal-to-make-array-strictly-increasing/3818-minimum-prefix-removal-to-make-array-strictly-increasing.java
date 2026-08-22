class Solution {
    public int minimumPrefixLength(int[] nums) {
        int count=0;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                count++;
            }
            else{
                break;
            } 
        }
        return nums.length-count-1;
    }
}