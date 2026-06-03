class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int[] pref=new int[nums.length];
        pref[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            pref[i]=pref[i-1]+nums[i];
        }
        int maxlength=-1;
        HashMap<Integer,Integer>mp=new HashMap<>();
        mp.put(0,-1);
        for(int i=0;i<pref.length;i++){
            int rem=pref[i]%k;
            if(mp.containsKey(rem)){
              maxlength=Math.max(maxlength,i-mp.get(rem));
            }
            else{
                mp.put(rem,i);
            }
        }
        if(maxlength>=2){
            return true;
        }
        return false;
    }
}