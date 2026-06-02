class Solution {
    public long zeroFilledSubarray(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=Math.abs(nums[i]);
        }
        long[] pref=new long[nums.length];
        pref[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            pref[i]=pref[i-1]+nums[i];
        }
        int k=0;
         long count=0;
        Map<Long,Integer>mp=new HashMap<>();
        mp.put(0L,1);
        for(int i=0;i<pref.length;i++){
            if(mp.containsKey(pref[i]-k)){
                count=count+mp.get(pref[i]-k);
            }
            mp.put(pref[i],mp.getOrDefault(pref[i],0)+1);
        }
        return count;

    }
}