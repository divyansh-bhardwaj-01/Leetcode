class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        int n=nums.length;
        Arrays.sort(nums);
        long m = mul;
        long sum=0;
        m=mul;
        for (int i=n-1;i>=n-k;i--) {
            if (m>0) {
                sum+=m*nums[i];
                m--;
            } else {
                sum+=nums[i];
            }
        }
        
        return sum;
    }
}