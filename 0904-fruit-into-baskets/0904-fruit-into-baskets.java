class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer,Integer>mp=new HashMap<>();
        int left=0;
         int max=0;
        for(int i=0;i<fruits.length;i++){
            mp.put(fruits[i],mp.getOrDefault(fruits[i],0)+1);
            while(mp.size()>2){
               mp.put(fruits[left],mp.getOrDefault(fruits[left],0)-1);
               if(mp.get(fruits[left])==0){
                  mp.remove(fruits[left]);
               }
               left++;
            
            }
            max=Math.max(max,i-left+1);
        }
        return max;
    }
}