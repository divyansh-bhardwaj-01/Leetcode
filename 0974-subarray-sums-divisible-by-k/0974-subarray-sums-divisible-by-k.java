class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        mp.put(0,1);
        int[] pref=new int[nums.length];
        pref[0]=nums[0];
        for(int i=1;i<nums.length;i++){
           pref[i]=pref[i-1]+nums[i];
        }
         
        int count=0;
        for(int i=0;i<pref.length;i++){
            if(mp.containsKey(((pref[i]%k)+k)%k)){
                count=count+mp.get(((pref[i]%k)+k)%k);
            }
             mp.put(((pref[i]%k)+k)%k,mp.getOrDefault(((pref[i]%k)+k)%k,0)+1);
        }
        return count;
    }
}