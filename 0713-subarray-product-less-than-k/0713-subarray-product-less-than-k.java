class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
       int count=0;    
       for(int i=0;i<nums.length;i++){
        int fact=1;
        for(int j=i;j<nums.length;j++){
            fact=fact*nums[j];
            if(fact<k){
                count++;
            }
            else{
                break;
            }
        }
       } 
       return count;
    }
}