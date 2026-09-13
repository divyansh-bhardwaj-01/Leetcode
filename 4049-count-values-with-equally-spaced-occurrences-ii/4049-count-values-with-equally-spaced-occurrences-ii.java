class Solution {
    public int countSpecialIntegers(int[] nums) {
          Map<Integer,List<Integer>>mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.computeIfAbsent(nums[i],k-> new ArrayList()).add(i);
        }
        int ans=0;
        for(int key:mp.keySet()){
            List<Integer>values=mp.get(key);
            int count=0;
            if(values.size()>=3){
                int num=values.get(1)-values.get(0);
               for(int i=2;i<values.size();i++){
                   int num1=values.get(i)-values.get(i-1);
                   if(num==num1){
                   count++;
                   num=num1;
               }
            }
            if(count==values.size()-2)ans++;
        }
        }
        return ans;
    }
}