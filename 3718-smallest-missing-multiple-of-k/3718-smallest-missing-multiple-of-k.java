class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer>st=new HashSet<>();
        for(int i:nums){
            st.add(i);
        }
        int num=k;
        while(st.contains(num)){
            num=num+k;
        }
        return num;
    }
}