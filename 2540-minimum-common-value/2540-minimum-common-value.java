class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        TreeMap<Integer,Integer>mp1=new TreeMap<>();
        TreeMap<Integer,Integer>mp2=new TreeMap<>();
        
        for(int i:nums1){
            mp1.put(i,mp1.getOrDefault(i,0)+1);
        }
         for(int i:nums2){
            mp2.put(i,mp2.getOrDefault(i,0)+1);
        }
        for(Integer key:mp1.keySet()){
           if(mp2.containsKey(key)){
            return key;
           }
        }
        return -1;
    }
}