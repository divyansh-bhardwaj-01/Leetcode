class Solution {
    public int countDominantElements(int[] nums) {
        int count=0;
        if(nums.length==1){
            return 1;
        }
        for(int i=1;i<nums.length-1;i++){
            int sum=0;
            int len=2;
            sum=sum+nums[i-1]+nums[i+1];
            if((double)sum/len<=nums[i]) count++;
        }
        if(nums[0]>=nums[1]){
            count++;
        }
        if(nums[nums.length-1]>=nums[nums.length-2]){
            count++;
        }
        return count;
    }
}