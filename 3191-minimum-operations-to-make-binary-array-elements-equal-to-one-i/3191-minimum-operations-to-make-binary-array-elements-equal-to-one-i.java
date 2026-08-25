class Solution {
    public int minOperations(int[] nums) {
        List<Integer>ans=new ArrayList<>();
        for(int i:nums){
            ans.add(i);
        }
        int count=0;
         for(int i=0;i<ans.size()-2;i++){
            if(ans.get(i)==0){
                ans.set(i,1);
                if(ans.get(i+1)==0) ans.set(i+1,1);
                else if(ans.get(i+1)==1) ans.set(i+1,0);
                if(ans.get(i+2)==0) ans.set(i+2,1);
                else if(ans.get(i+2)==1) ans.set(i+2,0);
                 count++;
            }
         }
         int acount=0;
         for(int i=0;i<ans.size();i++){
            if(ans.get(i)==1){
              acount++;
            }
         }
         if(acount==ans.size()){
            return count;
         }
         return -1;
    }
}