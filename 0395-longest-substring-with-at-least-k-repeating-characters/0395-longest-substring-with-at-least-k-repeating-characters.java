class Solution {
    public int longestSubstring(String s, int k) {
        Map<Character,Integer>mp=new HashMap<>();
        int max=0;
        for(int i=0;i<s.length();i++){
            int count=0;
            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);
                mp.put(ch,mp.getOrDefault(ch,0)+1);
                int freq=mp.get(ch);
                if(freq==k){
                    count++;
                }
                if(mp.size()==count){
                    max=Math.max(max,j-i+1);
                } 
            }
             mp.clear();
        }
        return max;
    }
}