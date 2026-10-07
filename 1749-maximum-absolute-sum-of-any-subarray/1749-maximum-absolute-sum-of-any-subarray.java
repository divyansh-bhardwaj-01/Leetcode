class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int max=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
             max=Math.max(sum,max);
             if(sum<=0){
                sum=0;
             }
        }
        
        int minsum=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            minsum=minsum+nums[i];
            if(minsum>=0){
                minsum=0;
            }
            min=Math.min(min,minsum);
        }
        min=Math.abs(min);
        int ans=Math.max(max,min);
        return ans;
    }
}