class Solution {
    public int waysToSplitArray(int[] nums) {
        long[] pref=new long[nums.length];
        long[] suff=new long[nums.length];
        pref[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            pref[i]=pref[i-1]+nums[i];
        }
        suff[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            suff[i]=suff[i+1]+nums[i];
        }
        for(int i=0;i<nums.length;i++){
            suff[i]=suff[i]-nums[i];
        }
        int count=0;
        for(int i=0;i<pref.length-1;i++){
         if(pref[i]>=suff[i]){
            count++;
         }
        }
        return count;
    }
}