class Solution {
    public int maxScore(int[] nums) {
        Arrays.sort(nums);
        long[] pref=new long[nums.length];
        pref[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            pref[i]=nums[i]+pref[i+1];
        }
        int count=0;
        for(int i=pref.length-1;i>=0;i--){
          if(pref[i]>0) count++;
        }
        return count;
    }
}