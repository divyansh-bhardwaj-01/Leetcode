class Solution {
    public List<Integer> findLonely(int[] nums) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
          for(Map.Entry<Integer, Integer>entry:mp.entrySet()) {
            Integer key=entry.getKey();
            Integer value=entry.getValue();
            if(value==1){
                   if (!mp.containsKey(key+1) && !mp.containsKey(key-1)){
                    ans.add(key);
                }
            }
          }
          return ans;
    }
}