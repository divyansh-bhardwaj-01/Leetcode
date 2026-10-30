class Solution {
    public int countMatchingSubarrays(int[] nums, int[] pattern) {
        int len=pattern.length;
        int ans=0;
        for(int i=0;i<nums.length-len;i++){
            int count=0;
            for(int k=0;k<pattern.length;k++){
               if(pattern[k]==1 && nums[i+k+1]>nums[i+k]){
                count++;
               }
               else if(pattern[k]==0 && nums[i+k+1]==nums[i+k]){
                count++;
               }
               else if(pattern[k]==-1 && nums[i+k+1]<nums[i+k]){
                count++;
               }
               else{
                break;
               }
            }  
            if(count==len) ans++; 
        }
        return ans;
    }
}