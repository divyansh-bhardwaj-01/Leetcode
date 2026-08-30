class Solution {
    public int minimumDeletions(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int minin=0;
        int maxin=0;
        for(int i=0;i<nums.length;i++){
            if(min>nums[i]){
                min=nums[i];
                minin=i;
            }
            if(max<nums[i]){
                max=nums[i];
                maxin=i;
            }
        }
        int del1=0;
        int del2=0;
        int del3=0;
        
            if(minin>maxin){
               del1=del1+minin+1;
            }
            else{
                del1=del1+maxin+1;
            }

         
        if(minin<maxin){
            del2=del2+nums.length-minin;
        }
        else{
            del2=del2+nums.length-maxin;
        }
        
        if(maxin<minin){
            del3=del3+maxin+1;
            if(minin>maxin){
                del3=del3+nums.length-minin;
            }
        }
        else{
            del3=del3+minin+1;
            if(maxin>minin){
                del3=del3+nums.length-maxin;
            }
        }
        
         int find= Math.min(del1,del2);
         int num=Math.min(find,del3);
         return num;
    }
}