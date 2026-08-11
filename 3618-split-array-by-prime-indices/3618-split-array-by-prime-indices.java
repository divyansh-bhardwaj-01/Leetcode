class Solution {
    public long splitArray(int[] nums) {
        List<Integer>ans1=new ArrayList<>();
        List<Integer>ans2=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int num=(int)Math.sqrt(i);
            int count=0;
            if(i<2){
                ans2.add(nums[i]);
                continue;
            }
            for(int j=2;j<=num;j++){
                if(i%j==0){
                  count++;
                }
            }
            if(count==0){
               ans1.add(nums[i]);
            }
            else{
                ans2.add(nums[i]);
            }
        }
        long sum1=0;
        long sum2=0;
        for(int i=0;i<ans1.size();i++){
           sum1=sum1+ans1.get(i);
        }
        for(int i=0;i<ans2.size();i++){
           sum2=sum2+ans2.get(i);
        }
        return Math.abs(sum1-sum2);
    }
}