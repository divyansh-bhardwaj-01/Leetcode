class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=Math.abs(nums[i]);
        }
         Arrays.sort(nums);
        int[] arr=new int[nums.length];
        int st=0;
        int end=nums.length-1;
         
        
          for(int i=0;i<=nums.length-1;i=i+2){
            arr[i]=nums[end];
            if(i+1<nums.length){
                arr[i+1]=nums[st];
            }

            st++;
            end--;
          }

        long esum=0;
        long osum=0;
        for(int i=0;i<arr.length;i++){
           if(i%2==0){
            esum=esum+((long)arr[i]*(long)arr[i]);
           }
           else{
             osum=osum+((long)arr[i]*(long)arr[i]);
           }
        }
        return esum-osum;
    }
}