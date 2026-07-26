class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int min1=nums[0];
        int min2=nums[1];
        int count=0;
        for(int i=0;i<nums.length;i++){
           if(nums[i]>=0){
            count++;
           }
        }
        int num=nums.length;
        int ans=0;
        ans=ans+nums[num-1]*nums[num-2]*nums[num-3];
        if(count==nums.length){
            return ans;
        }
        else{
           int c=0;
           for(int j=0;j<nums.length;j++){
            if(nums[j]<0) c++;
           }
           if(c>=2){
            if((min1*min2*nums[num-1])>ans){
                return (min1*min2*nums[num-1]);
            }
           }
        }
           return ans;
    }
}