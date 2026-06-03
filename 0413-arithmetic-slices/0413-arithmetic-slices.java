class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int count=0;
        int ans=0;
        for(int i=1;i<nums.length-1;i++){
           if(nums[i]-nums[i-1]==nums[i+1]-nums[i]){
            count++;
            ans=ans+count;
           }
           else{
            count=0;
           }
        }
        return ans;
    }
}