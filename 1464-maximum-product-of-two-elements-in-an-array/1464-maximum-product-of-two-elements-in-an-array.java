class Solution {
    public int maxProduct(int[] nums) {
      int n=nums.length;  
         Arrays.sort(nums);  
         int sum=(nums[n-1]-1)*(nums[n-2]-1);
         return sum;   
    }
}