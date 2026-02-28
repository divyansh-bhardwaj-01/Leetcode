class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        Arrays.sort(nums);
        int sum=nums[nums.length-1]+nums[nums.length-2]-nums[0];
        return sum;
    }
}