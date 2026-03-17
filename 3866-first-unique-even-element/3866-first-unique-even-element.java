class Solution {
    public int firstUniqueEven(int[] nums) {
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i:nums){
            ans.add(i);
        }
       Map<Integer,Integer>mp=new HashMap<>();
       for(int i:ans){
        mp.put(i,mp.getOrDefault(i,0)+1);
       }
       for(int i=0;i<ans.size();i++){
         if(ans.get(i)%2==0 && mp.get(ans.get(i))>1){
         ans.remove(ans.get(i));
         i--;
         }
       }
       for(int i=0;i<ans.size();i++){
        if(ans.get(i)%2==0){
            return ans.get(i);
        }
       }
       return -1;
    }
}