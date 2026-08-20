class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer>ls1=new ArrayList<>();
        List<Integer>ls2=new ArrayList<>();
        ls1.add(nums[0]);ls2.add(nums[1]);
        for(int i=2;i<nums.length;i++){
             if(ls1.get(ls1.size()-1)>ls2.get(ls2.size()-1)){
                ls1.add(nums[i]);
             }
             else{
                ls2.add(nums[i]);
             }
        }
        int[] ans=new int[nums.length];
        for(int i=0;i<ls1.size();i++){
            ans[i]=ls1.get(i);
        }
        for(int i=0;i<ls2.size();i++){
            ans[ls1.size()+i]=ls2.get(i);
        }
        return ans;

    }
}