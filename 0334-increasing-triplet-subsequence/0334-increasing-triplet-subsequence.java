class Solution {
    public boolean increasingTriplet(int[] nums) {
        int third=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int i=nums.length-1;i>=0;i--){
            int num=nums[i];
            if(num>=third){
                third=num;
            }
            else if(num>=second){
                second=nums[i];
            }
            else return true;
        }
        return false;
    }
}