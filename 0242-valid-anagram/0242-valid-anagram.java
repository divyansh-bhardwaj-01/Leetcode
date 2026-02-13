class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Integer>mp1=new HashMap<>();
        Map<Character,Integer>mp2=new HashMap<>();
        for(char i:s.toCharArray()){
          mp1.put(i,mp1.getOrDefault(i,0)+i);
        }

        for(char i:t.toCharArray()){
            mp2.put(i,mp2.getOrDefault(i,0)+i);
        }
        if(mp1.equals(mp2)){
            return true;
        }
        return false;
        
    }
}