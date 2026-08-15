class Solution {
    public int longestSubsequence(int[] nums) {
       int xor=0;
       int max=Integer.MIN_VALUE;
       int count0=0;
       for(int i=0;i<nums.length;i++){
          xor=xor^nums[i];
          if(nums[i]==0){
            count0++;
          }
       }
       if(xor!=0){
        return nums.length;
       }
       if(xor==0 && count0!=nums.length){
        return nums.length-1;
       }
       return 0;
    }
}