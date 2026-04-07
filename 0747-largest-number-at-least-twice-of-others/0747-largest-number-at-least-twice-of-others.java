class Solution {
    public int dominantIndex(int[] nums) {
        int max=Integer.MIN_VALUE;
        int index=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                index=i;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=max && nums[i]*2<=max){
                count++;
            }
        }
        if(count==nums.length-1){
            return index;
        }
        return -1;
    }
}