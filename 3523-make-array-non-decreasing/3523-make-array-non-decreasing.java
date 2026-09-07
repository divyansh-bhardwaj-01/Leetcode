class Solution {
    public int maximumPossibleSize(int[] nums) {
        Stack<Integer>st=new Stack<>();
        st.push(nums[0]);
        for(int i=1;i<nums.length;i++){
             if(!st.empty() && st.peek()<=nums[i]) st.push(nums[i]);
        }
        return st.size();
    }
}