class Solution {
    public int subarrayGCD(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
             if(nums[i]==k) count++;
            int num=nums[i];
            for(int j=i+1;j<nums.length;j++){
                int a=num;
                int b=nums[j];
                while(b!=0){
                    int temp=b;
                    b=a%b;
                    a=temp;
                }
                if(a==k){
                    count++;
                }
                num=a;
            }
        }
        return count;
    }
}