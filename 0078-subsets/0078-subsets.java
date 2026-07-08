class Solution {
    public static void subset(int[] nums,List<List<Integer>>ans,List<Integer>list,int index){
        if(index>=nums.length){
          ans.add(new ArrayList<>(list));
          return;
        }
        //include
        list.add(nums[index]);
        subset(nums,ans,list,index+1);
        //exclude
        list.remove(list.size()-1);
        subset(nums,ans,list,index+1);

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>list=new ArrayList<>();
        int index=0;
        subset(nums,ans,list,index);
        return ans;
    }
}