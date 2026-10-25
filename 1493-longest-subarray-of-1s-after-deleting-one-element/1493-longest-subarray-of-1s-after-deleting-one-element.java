class Solution {
    public int longestSubarray(int[] nums) {
      Map<Integer,Integer>mp=new HashMap<>(); 
      int left=0;
      int max=0;
      for(int i=0;i<nums.length;i++){
        mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        while( nums[i]==0 &&  mp.get(nums[i])>1){
            mp.put(nums[left],mp.getOrDefault(nums[left],0)-1);
            left++;
        }
        max=Math.max(max,i-left+1);
      } 
      return max-1;
    }
}