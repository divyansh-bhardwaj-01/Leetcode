class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int num=0;
            if(nums[i]==target){
                num=num+Math.abs(i-start);
                if(min>num){
                    min=num;
                }
            }
        }
        return min;
    }
}