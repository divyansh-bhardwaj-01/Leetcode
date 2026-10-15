class Solution {
    public int sumCounts(List<Integer> nums) {
        int ans=0;
        for(int i=0;i<nums.size();i++){
            for(int j=i;j<nums.size();j++){
                Set<Integer>st=new HashSet<>();
               for(int k=i;k<=j;k++){
                st.add(nums.get(k));
               } 
               ans=ans+(st.size()*st.size());
            }
        }
        return ans;
    }
}