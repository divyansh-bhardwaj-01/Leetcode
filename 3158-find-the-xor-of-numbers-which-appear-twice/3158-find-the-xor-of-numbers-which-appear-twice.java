class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Map<Integer,Integer>mp=new HashMap<>();
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
    for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
        int key = entry.getKey();
            int value = entry.getValue();
            
            if(value==2){
              ans.add(key);
            }
    }


if(ans.size()==0){
           return 0;
        }
        else if(ans.size()==1){
          return ans.get(0);
        }
             int num=0;
             num=ans.get(0)^ans.get(1);
        
             for(int i=2;i<ans.size();i++){
                num=num^ans.get(i);
            }
        
return num;
    
    }
}