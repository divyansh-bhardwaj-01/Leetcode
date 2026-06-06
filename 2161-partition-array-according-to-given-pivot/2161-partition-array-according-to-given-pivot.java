class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                ans.add(nums[i]);
            }
        }
         for(int i=0;i<nums.length;i++){
            if(nums[i]==pivot){
                ans.add(nums[i]);
            }
        }
         for(int i=0;i<nums.length;i++){
            if(nums[i]>pivot){
                ans.add(nums[i]);
            }
        }
     for(int i=0;i<nums.length;i++){
             nums[i]=ans.get(i);
        }
        return nums;
    }

}