class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
           int n=nums.length-1;
        int max=nums[n]*nums[n-1];
        int min=nums[0]*nums[1];
return max-min;
    
    }
}