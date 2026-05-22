class Solution {
    public long[] findPrefixScore(int[] nums) {
        long[] arr=new long[nums.length];
        arr[0]=nums[0]+nums[0];
        int max=Math.max(nums[0],nums[1]);
        for(int i=1;i<nums.length;i++){
            int maximum=Math.max(max,nums[i]);
            arr[i]=nums[i]+maximum;
            max=maximum;  
        }
        long[] pref=new long[arr.length];
        pref[0]=arr[0];
          for(int i=1;i<arr.length;i++){
            pref[i]=pref[i-1]+arr[i];
          }
          return pref;
    }
}