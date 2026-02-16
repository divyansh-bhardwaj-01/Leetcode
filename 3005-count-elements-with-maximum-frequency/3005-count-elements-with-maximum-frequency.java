class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> mp = new HashMap<>();

        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        int maxfreq=0;
        for(int i:mp.values()){
          maxfreq=Math.max(maxfreq,i);
        }
        int sum=0;
        for(int i:mp.values()){
            if(maxfreq==i){
                sum=sum+i;
            }
        }
        return sum;
    }
}