class Solution {
    public int countSpecialIntegers(int[] nums) {
        Map<Integer,List<Integer>>mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.computeIfAbsent(nums[i],k-> new ArrayList()).add(i);
        }
        int count=0;
        for(int key:mp.keySet()){
            List<Integer>values=mp.get(key);
            int num1=0;
            int num2=0;
            int num3=0;
            if(values.size()==3){
             num1=values.get(0);
             num2=values.get(1);
             num3=values.get(2);  
            }
            
            if(values.size()==3 && (num2-num1) == (num3-num2)) count++;
        }
        return count;
    }
}