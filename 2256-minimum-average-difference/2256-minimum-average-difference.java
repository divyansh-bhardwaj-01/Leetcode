class Solution {
    public int minimumAverageDifference(int[] nums) {
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
       long[] arr=new long[nums.length];
        for(int i=0;i<nums.length-1;i++){
          arr[i]=Math.abs((pref[i]/(i+1))- (suff[i]/(nums.length-i-1)));
        }
        arr[nums.length-1]=pref[nums.length-1]/nums.length;
        long min=Long.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
           min=Math.min(min,arr[i]);
        }
        for(int i=0;i<arr.length;i++){
           if(min==arr[i]){
            return i;
           }
        }
return 0;

    }
}