class Solution {
    public int countGoodSubstrings(String s) {
        int k=3;
        int count=0;
        for(int i=0;i<=s.length()-k;i++){
            Map<Character,Integer>mp=new HashMap<>();
            for(int j=i;j<i+k;j++){
              char ch=s.charAt(j);
              mp.put(ch,mp.getOrDefault(ch,0)+1);
            }
            if(mp.size()==3) count++;
            mp.clear();
        }
        return count;
    }
}