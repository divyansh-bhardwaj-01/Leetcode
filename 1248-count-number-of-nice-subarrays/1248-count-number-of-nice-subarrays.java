class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0)
            nums[i]=1;
            else
            nums[i]=0; 
        }
        int[] pref=new int[nums.length];
        pref[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            pref[i]=nums[i]+pref[i-1];
        }
        HashMap<Integer,Integer>mp=new HashMap<>();
        mp.put(0,1);
        int count=0;
        for(int i=0;i<pref.length;i++){
            if(mp.containsKey(pref[i]-k)){
                count=count+mp.get(pref[i]-k);
            }
            mp.put(pref[i],mp.getOrDefault(pref[i],0)+1);
        }
        return count;
    }
}