class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        Map<Integer,Integer>mp=new HashMap<>();
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        int i=nums.length/2;
        int num=nums[i];
        for(int key:mp.keySet()){
            if(mp.containsKey(num) && mp.get(num)>1){
                return false;
            }
        }
        return true;

    }
}