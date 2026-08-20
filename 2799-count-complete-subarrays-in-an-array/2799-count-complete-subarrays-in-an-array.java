class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int count=0;
        Map<Integer,Integer>mp=new HashMap<>();
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        for(int i=0;i<nums.length;i++){
            Map<Integer,Integer>map=new HashMap<>();
           for(int j=i;j<nums.length;j++){
             map.put(nums[j],map.getOrDefault(nums[j],0)+1);
             if(map.size()==mp.size()){
               count++;
             }
           }       
           map.clear();
        }
        return count;
    }
}