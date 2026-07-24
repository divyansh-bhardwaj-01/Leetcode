class Solution {
    public int flipgame(int[] fronts, int[] backs) {
       Map<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<fronts.length;i++){
            if(fronts[i]==backs[i]){
              mp.put(fronts[i],mp.getOrDefault(fronts[i],0)+1);
            }
        }
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<fronts.length;i++){
            if(!mp.containsKey(fronts[i])){
                ans.add(fronts[i]);
            }
             if(!mp.containsKey(backs[i])){
                ans.add(backs[i]);
            }
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<ans.size();i++){
            if(min>ans.get(i)){
                min=ans.get(i);
            }
        }
        if(min==2147483647){
            return 0;
        }
        return min;
    }
}