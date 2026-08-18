class Solution {
    public int largestInteger(int[] nums, int k) {
        Map<Integer,Integer>mp=new HashMap<>();
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        int max=-1;
        if(nums.length==k){
            for(int i=0;i<nums.length;i++){
               max=Math.max(max,nums[i]);
            }
            return max;
        }
        if(k==1){
        for(int key:mp.keySet()){
            int value=mp.get(key);
            if(value==1){
                max=Math.max(max,key);
            }
        }
        return max;
        }

         
        int st=nums[0];
        int end=nums[nums.length-1];
        if(mp.get(st)>1 && mp.get(end)>1){
            return -1;
        }
        if(mp.get(st)==1 && mp.get(end)!=1) return st;
        else if(mp.get(st)!=1 && mp.get(end)==1) return end;
        return Math.max(st,end);
        

    }
}