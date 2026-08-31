class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer>mp1=new HashMap<>();
        Map<Character,Integer>mp2=new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            char ch=magazine.charAt(i);
            mp1.put(ch,mp1.getOrDefault(ch,0)+1);
        } 
        for(int i=0;i<ransomNote.length();i++){
            char ch=ransomNote.charAt(i);
            mp2.put(ch,mp2.getOrDefault(ch,0)+1);
        } 
        for(Map.Entry<Character,Integer>entry:mp2.entrySet()){
           char key=entry.getKey();
           int value=entry.getValue();
           if(mp1.containsKey(key)){
            if(value>mp1.get(key)){
               return false;
            }
           }
           else{
            return false;
           }
        }
        return true;
    }
}