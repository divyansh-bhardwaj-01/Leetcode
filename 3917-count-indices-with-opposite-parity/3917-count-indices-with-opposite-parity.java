class Solution {
    public int[] countOppositeParity(int[] nums) {
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int counte=0;
            int counto=0;
            for(int j=i+1;j<nums.length;j++){
              if(nums[i]%2!=0){
                if(nums[j]%2==0){
                    counte++;
                }
              }
             else if(nums[i]%2==0){
                if(nums[j]%2!=0){
                    counto++;
                }
             }
            }
            if(nums[i]%2!=0){
                arr[i]=counte;
            }
            else{
                arr[i]=counto;
            }
        }
        return arr;
    }
}