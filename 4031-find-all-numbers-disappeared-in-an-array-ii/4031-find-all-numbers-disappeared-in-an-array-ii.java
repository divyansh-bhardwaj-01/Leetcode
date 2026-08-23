class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
         Arrays.sort(nums);
        ArrayList<Integer>ans=new ArrayList<>();
        int j=0;
        for(int i=lower;i<=upper;i++){
            while(j<nums.length && nums[j]<i){
                j++;
            }
            if(j<nums.length && i==nums[j]){
                j++;
                continue;
            }
            else{
               ans.add(i);
            }
        }
        List<List<Integer>>list=new ArrayList<>();
        if(ans.size()==0){
            return list;
        }
        int left=0;
        for(int i=0;i<ans.size()-1;i++){
            List<Integer>inlist=new ArrayList<>();
            if(ans.get(i)+1==ans.get(i+1)){
                continue;
            }
            inlist.add(ans.get(left));
            inlist.add(ans.get(i));
            list.add(inlist);
            left=i+1;
        }

        List<Integer>inlist=new ArrayList<>();
        inlist.add(ans.get(left));
        inlist.add(ans.get(ans.size()-1));
        list.add(inlist);
        return list;
        
    }
}