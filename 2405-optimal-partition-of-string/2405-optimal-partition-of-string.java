class Solution {
    public int partitionString(String s) {
        Map<Character,Integer>mp=new HashMap<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(mp.containsKey(ch)){
                mp.clear();
                mp.put(ch,mp.getOrDefault(ch,0)+1);
                count++;
            }
            else{
                mp.put(ch,mp.getOrDefault(ch,0)+1);
            }
        }
        return count+1;
    }
}