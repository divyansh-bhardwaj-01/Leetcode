class Solution {
    public int missingMultiple(int[] nums, int k) {
        Map<Integer,Integer>mp=new TreeMap<>();
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
       for(int i=k;i<=100000;i=i+k){
           ans.add(i);
       }
       for(int i=0;i<ans.size();i++){
        int num=ans.get(i);
        if(mp.containsKey(num)){
                continue;
        }
        else{
            return ans.get(i);
        }
       }
       return 0;
    }
}