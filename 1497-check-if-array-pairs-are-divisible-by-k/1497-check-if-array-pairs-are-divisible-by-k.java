class Solution {
    public boolean canArrange(int[] arr, int k) {
        int count=0;
        Map<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int rem=((arr[i]%k)+k)%k;
            int need=(k-rem)%k;
            if(mp.containsKey(need) && mp.get(need)>0){
                count++;
                  mp.put(need,mp.getOrDefault(need,0)-1);
            }
            else{
                mp.put(rem,mp.getOrDefault(rem,0)+1);
            }
        }
        if(count>=arr.length/2){
            return true;
        }
        return false;
    }
}