class Solution {
    public int maximumLengthSubstring(String s) {
        int max=0;
        int left=0;
        Map<Character,Integer>mp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
            while(mp.get(ch)>2){
              char lef=s.charAt(left);
              mp.put(lef,mp.getOrDefault(lef,0)-1);
              left++;
            }
            max=Math.max(max,i-left+1);
        }
        return max;
    }
}