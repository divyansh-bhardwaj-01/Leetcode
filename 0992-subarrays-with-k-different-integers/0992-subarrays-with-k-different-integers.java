class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        Map<Integer,Integer>mp1=new HashMap<>();
        Map<Integer,Integer>mp2=new HashMap<>();
        int left1=0;
        int left2=0;
        int count1=0;
        int count2=0;
        for(int i=0;i<nums.length;i++){
            mp1.put(nums[i],mp1.getOrDefault(nums[i],0)+1);
            while(mp1.size()>k){
                mp1.put(nums[left1],mp1.getOrDefault(nums[left1],0)-1);
                if(mp1.get(nums[left1])==0){
                    mp1.remove(nums[left1]);
                }
                left1++;
            }
             count1=count1+i-left1+1;
        }

        for(int i=0;i<nums.length;i++){
            mp2.put(nums[i],mp2.getOrDefault(nums[i],0)+1);
            while(mp2.size()>k-1){
                mp2.put(nums[left2],mp2.getOrDefault(nums[left2],0)-1);
                if(mp2.get(nums[left2])==0){
                    mp2.remove(nums[left2]);
                }
                left2++;
            }
             count2=count2+i-left2+1;
        }
       return count1-count2;
    }
}