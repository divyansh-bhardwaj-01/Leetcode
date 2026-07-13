class Solution {
    public long countCompleteDayPairs(int[] hours) {
        long count=0;
        int k=24;
        Map<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<hours.length;i++){
            int rem=hours[i]%k;
            int need=(k-rem)%k;
            
            if(mp.containsKey(need) ){
                count=count+mp.get(need);
            }
                mp.put(rem,mp.getOrDefault(rem,0)+1);
        }
        return count;
    }
}