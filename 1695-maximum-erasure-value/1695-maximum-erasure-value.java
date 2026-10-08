class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        ArrayList<Integer>ans=new ArrayList<>();
        Map<Integer,Integer>mp=new HashMap<>();
        int left=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
          int sum=0;
          mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
          ans.add(nums[i]);
          while(mp.get(nums[i])>1){
            mp.put(nums[left],mp.getOrDefault(nums[left],0)-1);
            left++;
            if(ans.size()!=0){
               ans.remove(0);
            }
          }
          for(int j=0;j<ans.size();j++){
            sum=sum+ans.get(j);
          }
          max=Math.max(max,sum);
        
        }
         return max;
    }
}