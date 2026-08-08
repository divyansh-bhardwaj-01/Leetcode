class Solution {
    public int searchInsert(int[] nums, int target) {
       
          int st=0;
          int end=nums.length-1;
          int ans=nums.length;
          while(st<=end){
            int mid=(st+end)/2;
            if(nums[mid]>=target){
                ans=mid;
                end=mid-1;
            }
            else{
                st=mid+1;
            }
          }
         
            return ans;
          
    }
}