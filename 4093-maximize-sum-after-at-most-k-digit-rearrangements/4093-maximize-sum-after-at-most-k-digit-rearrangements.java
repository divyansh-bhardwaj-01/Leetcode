class Solution {
    public long maximizeSum(int[] nums, int k) {
        long ans=0;
        int count=0;
        long[] arr=new long[nums.length];
        for(int i=0;i<nums.length;i++){
            ans=ans+nums[i];
            char [] ch=String.valueOf(nums[i]).toCharArray();
            Arrays.sort(ch);
            int maxnum=0;
            for(int j=ch.length-1;j>=0;j--){
                maxnum=maxnum*10+(ch[j]-'0');
            }
            arr[i]=maxnum-nums[i];
            
        }
        Arrays.sort(arr);

        for(int i=arr.length-1;i>=arr.length-k;i--){
            ans+=arr[i];
        }
        return ans;
      
    }
}