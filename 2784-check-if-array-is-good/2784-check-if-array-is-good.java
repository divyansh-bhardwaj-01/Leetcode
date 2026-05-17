class Solution {
    public boolean isGood(int[] nums) {
       int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
           if(max<nums[i]){
            max=nums[i];
           }
        }
        int count=0;
        HashMap<Integer,Integer>mp=new HashMap<>();
          for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        for(int i:mp.keySet()){
            if(mp.get(i)==2){
                count++;
            }
            if(mp.get(i)>2){
                return false;
            }
        }
        if(count>1){
            return false;
        }
       
        if(max+1==nums.length && mp.get(max)==2){
            return true;
        }
        return false;
    }
}