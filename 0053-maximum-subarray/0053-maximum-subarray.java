class Solution {
    public int maxSubArray(int[] nums) {
        int ctsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            ctsum=ctsum+nums[i];
            maxsum=Math.max(ctsum,maxsum);
            if(ctsum<=0){
                ctsum=0;
            }
        }
        return maxsum;
    }
}