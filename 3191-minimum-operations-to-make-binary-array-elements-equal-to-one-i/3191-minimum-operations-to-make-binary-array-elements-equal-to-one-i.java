class Solution {
    public int minOperations(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]==0){
                nums[i]=1;
                nums[i+1]=nums[i+1]==1 ? 0:1;
                nums[i+2]=nums[i+2]==1 ? 0:1;
                count++;
            }
        }
            int acount=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==1) acount++;
            }
            if(acount==nums.length) return count;
         return -1;
    }
}