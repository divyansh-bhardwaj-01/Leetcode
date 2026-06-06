class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] pref=new int[nums.length];
        int[] suff=new int[nums.length];
        pref[0]=nums[0];
        for(int i=1;i<nums.length;i++){
          pref[i]=nums[i]+pref[i-1];
        }
        suff[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            suff[i]=suff[i+1]+nums[i];
        }
        for(int i=0;i<pref.length;i++){
            nums[i]=Math.abs(pref[i]-suff[i]);
        }
        return nums;
    }
}