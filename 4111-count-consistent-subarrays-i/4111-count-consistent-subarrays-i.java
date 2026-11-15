class Solution {
    public int countConsistent(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length-1;i++){
           int min=nums[i];
           int bitwise=nums[i];
           for(int j=i;j<nums.length;j++){
              min=Math.min(min,nums[j]);
              bitwise=bitwise & nums[j];
              if(bitwise==min) count++;
           }
        }
        return count+1;
    }
}