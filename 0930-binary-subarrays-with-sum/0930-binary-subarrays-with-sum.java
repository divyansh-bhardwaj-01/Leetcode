class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int[] pref=new int[nums.length];
        HashMap<Integer,Integer>mp=new HashMap<>();
        mp.put(0,1);
        pref[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            pref[i]=pref[i-1]+nums[i];
        }
        int count=0;
        for(int i=0;i<pref.length;i++){
            if(mp.containsKey(pref[i]-goal)){
                count=count+mp.get(pref[i]-goal);
            }
            mp.put(pref[i],mp.getOrDefault(pref[i],0)+1);
        }
        return count;
    }
}