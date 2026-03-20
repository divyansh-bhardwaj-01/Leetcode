class Solution {
    public int pivotIndex(int[] nums) {
       for(int i=0;i<nums.length;i++){
            int lsum=0;
        int rsum=0;
            for(int j=0;j<nums.length;j++){
                if(j<i){
                    lsum=lsum+nums[j];
                }
                if(j>i){
                    rsum=rsum+nums[j];
                }
                
            }
            if(rsum==lsum){
                return i;
            }
        }
        return -1;
    }
}