class Solution {
    public int countDominantElements(int[] nums) {
        int count=0;
        if(nums.length==1){
            return 1;
        }
        for(int i=0;i<nums.length;i++){
            int sum=0;
            int len=0;
            for(int j=i-1;j>=0 && j==i-1;j--){
                if(j>=0){
                   sum=sum+nums[j];
                    len++;
                }
                
            }

            for(int j=i+1;j<nums.length;j++){
                if(j==i+1){
                   sum=sum+nums[j];
                    len++;
                }
                
            }
            
            if((double)sum/len<=nums[i]) count++;
        }
        return count;
    }
}