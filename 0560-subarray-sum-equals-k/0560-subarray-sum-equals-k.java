class Solution {
    public int subarraySum(int[] nums, int k) {
         HashMap<Integer,Integer>mp=new HashMap<>();
        int[] pref=new int[nums.length];
        pref[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            pref[i]=pref[i-1]+nums[i];
        }
        mp.put(0,1);
        int count=0;
         for(int i=0;i<nums.length;i++){
            if(mp.containsKey(pref[i]-k)){
                count=count+mp.get(pref[i]-k);
            }
            mp.put(pref[i],mp.getOrDefault(pref[i],0)+1);
         }
        return count;
    }
}