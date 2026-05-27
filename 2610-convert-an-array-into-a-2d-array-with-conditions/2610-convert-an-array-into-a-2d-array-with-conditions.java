class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
    HashMap<Integer,Integer>mp=new HashMap<>();
    List<List<Integer>>ans=new ArrayList<>();
    for(int i:nums){
        mp.put(i,mp.getOrDefault(i,0)+1);
    }
    int row=-1;
    int col=0;
    for(int i:mp.values()){
       if(i>row){
        row=i;
       }   
    }
   for(int i=1;i<=row;i++){
    ArrayList<Integer>rw=new ArrayList<>();
        for(int key:mp.keySet()){
          int value=mp.get(key);
            if(value>=i){
               rw.add(key);
            } 
        }
      ans.add(rw);
    }
     return ans;
    }
}