class Solution {
    public int sumOfUnique(int[] nums) {
        List<Integer>ans=new ArrayList<>();
        Map<Integer,Integer>mp=new HashMap<>();
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        for(int key:mp.keySet()){
            int value=mp.get(key);
            if(value==1){
                ans.add(key);
            }
        }
        int as=0;
        for(int i=0;i<ans.size();i++){
            as=as+ans.get(i);
        }
        return as;

    }
}