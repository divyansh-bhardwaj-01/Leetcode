class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        for(int i=0;i<queries.length;i++){
            int idx=queries[i][0];
            int r=queries[i][1];
            int k=queries[i][2];
            int v=queries[i][3];
            while(idx<=r){
                nums[idx]=(int)(((long)nums[idx]*v)%(1000000007));
                idx=idx+k;
            }
        }
        int xor=nums[0];
        for(int i=1;i<nums.length;i++){
            xor=xor^nums[i];
        }
        return xor;
    }
}