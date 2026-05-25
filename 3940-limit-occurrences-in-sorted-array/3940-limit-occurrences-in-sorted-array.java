class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
       ArrayList<Integer>ans=new ArrayList<>();
       TreeMap<Integer,Integer>mp=new TreeMap<>();
       for(int i:nums){
        mp.put(i,mp.getOrDefault(i,0)+1);
       } 
       for(Map.Entry<Integer,Integer>entry:mp.entrySet()){
        int key=entry.getKey();
        int value=entry.getValue();
        if(value>k){
            for(int i=1;i<=k;i++){
                ans.add(key);
            }
        }
            else{
                for(int i=1;i<=value;i++){
                    ans.add(key);
                }
            }
        
       }
       int[] arr=new int[ans.size()];
       for(int i=0;i<ans.size();i++){
       arr[i]=ans.get(i);
       }
       return arr;
    }
}