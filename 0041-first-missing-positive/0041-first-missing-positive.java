class Solution {
    public int firstMissingPositive(int[] nums) {
      List<Integer>ans=new ArrayList<>();
      Set<Integer>st=new HashSet<>();
      for(int i:nums){
        st.add(i);
      }  
      for(int i=1;i<=nums.length;i++){
        ans.add(i);
      }
      for(int i=0;i<ans.size();i++){
        if(!st.contains(ans.get(i))){
           return ans.get(i);
        }
      }
      return nums.length+1;
    }
}