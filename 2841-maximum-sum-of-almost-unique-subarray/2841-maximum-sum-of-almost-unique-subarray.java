class Solution {
    public long maxSum(List<Integer> nums, int m, int k) {
        Map<Integer,Integer>mp=new LinkedHashMap<>();
        int left=0;
        int count=0;
        long max=0;
        long sum=0;
        for(int i=0;i<nums.size();i++){
            mp.put(nums.get(i),mp.getOrDefault(nums.get(i),0)+1);
            sum=sum+(long)nums.get(i);
            while(i-left+1>k){
                sum=sum-nums.get(left);
                 mp.put(nums.get(left),mp.getOrDefault(nums.get(left),0)-1);
                  
                 if(mp.get(nums.get(left))==0){
                    mp.remove(nums.get(left));
                 }
                 left++;
            }
             if(i-left+1==k && mp.size()>=m){
                max=Math.max(max,sum);
             }
             
        }
        return max;
    }
}