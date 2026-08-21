class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer,Integer>mp=new HashMap<>();
        int max=Integer.MIN_VALUE;
        int left=0;
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
            
             for(int j=left;j<=i;j++){
                if(mp.get(nums[i])>k){
                   mp.put(nums[left],mp.getOrDefault(nums[left],0)-1);
                       left++;
                }
                else{
                    break;
                }
             }
            
                max=Math.max(max,i-left+1);

        }
        return max;
    }
}