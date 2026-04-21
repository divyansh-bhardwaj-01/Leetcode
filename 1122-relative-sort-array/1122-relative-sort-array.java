class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        ArrayList<Integer>ans=new ArrayList<>();
        TreeMap<Integer,Integer>mp=new TreeMap<>();
        for(int i:arr1){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        
        for(int i:arr2){
               
            if(mp.containsKey(i)){
                 int value=mp.get(i);
                for(int j=0;j<value;j++){
                    ans.add(i);
                }
                mp.remove(i);
            }
        }

        for(Map.Entry<Integer,Integer>entry:mp.entrySet()){
            int key=entry.getKey();
            int value=entry.getValue();
            for(int i=0;i<value;i++){
                ans.add(key);
            }
        }

       int[] res=new int[ans.size()];
       for(int i=0;i<ans.size();i++){
        res[i]=ans.get(i);
       }
        return res;
    }
}