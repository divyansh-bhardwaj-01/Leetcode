class Solution {
    public void moveZeroes(int[] nums) {
         
        ArrayList<Integer>ans=new ArrayList<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
            }
            else{
                ans.add(nums[i]);
            }
        }
        for(int i=1;i<=count;i++){
            ans.add(0);
        }
       int[] arr=new int[ans.size()];
       for(int i=0;i<ans.size();i++){
        nums[i]=ans.get(i);
       }
       
    }
}