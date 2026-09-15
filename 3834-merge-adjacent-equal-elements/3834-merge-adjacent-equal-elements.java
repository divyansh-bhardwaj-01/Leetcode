class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        Stack<Long>st=new Stack<>();
        List<Long>ans=new ArrayList<>(); 
        st.add((long)nums[0]);
        for(int i=1;i<nums.length;i++){
            if(st.peek()==nums[i]){
                st.set(st.size()-1,(long)st.peek()+nums[i]);
            }
            else{
                st.add((long)nums[i]);
            }

            while(st.size()>=2 && st.get(st.size()-2).equals(st.peek())){
                long merged = st.peek()+st.get(st.size()-2);
                st.pop();                   
                st.set(st.size()-1,merged);
            }
        }
        for(long i:st){
            ans.add((long)i);
        }
        return ans;
    }
}