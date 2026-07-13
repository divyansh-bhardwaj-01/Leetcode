class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        Map<Integer,Integer>mp=new HashMap<>();
        int count=0;
        for(int i=0;i<time.length;i++){
            int rem=time[i]%60;
            int need=(60-rem)%60;
            if(mp.containsKey(need)){
                count=count+mp.get(need);
            }
            mp.put(rem,mp.getOrDefault(rem,0)+1);
        }
        return count;
    }
}