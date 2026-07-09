class Solution {
    public int[] nextGreaterElements(int[] nums) {
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int count=0;
            if(i!=nums.length-1){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[j]>nums[i]){
                        list.add(nums[j]);
                        count++;
                        break;
                    }
                    
                 }
            }
             if(count==0){
                for(int j=0;j<i;j++){
                    if(nums[j]>nums[i]){
                        list.add(nums[j]);
                        count++;
                        break;
                    }
                }
            }
            if(count==0){
                list.add(-1);
            }
        } 
        int[] arr=new int[nums.length];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }                      
        return arr;             
    }
}