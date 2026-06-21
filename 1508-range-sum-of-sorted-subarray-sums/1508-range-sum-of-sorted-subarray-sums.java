class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        List<Integer>ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
              sum=sum+nums[j];
              ans.add(sum);
            }
        }
        Collections.sort(ans);
        long sum=0;
        for(int i=left-1;i<=right-1;i++){
            sum=sum+ans.get(i);
        }
       
            return (int)(sum%1000000007);
        
    }
}