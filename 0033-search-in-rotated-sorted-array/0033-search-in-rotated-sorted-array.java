class Solution {
    public int search(int[] nums, int target) {
        if(nums.length==1){
           if(target==nums[0]){
           return 0;
           }
           else{
            return -1;
           }
        }

        int low=0;
        int high=nums.length-1;
        while(low<high){
           int mid=(low+high)/2;
           if(nums[mid]>nums[high]){
            low=mid+1;
           }
           else{
            high=mid;
           }
        }
        int num=low;

       
         
        int st=0;
        int end=num-1;
        while(st<=end){
          int mid=(st+end)/2;
          if(nums[mid]==target){
            return mid;
          }
          else if(target>nums[mid]){
             st=mid+1;
          }
          else{
            end=mid-1;
          }
        }
        int starting=num;
        int ending=nums.length-1;
        while(starting<=ending){
            int mid=(starting+ending)/2;
            if(target==nums[mid]){
                return mid;
            }
            else if(target>nums[mid]){
                starting=mid+1;
            }
            else{
                ending=mid-1;
            }
        }
        return -1;
    }
}