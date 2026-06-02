class Solution {
    public boolean checkString(String s) {
        int counta=0;
        int countb=0;
         if(!s.contains("a")){
            return true;
         }
        
        Map<Character,Integer>mp=new HashMap<>();
        for(char i:s.toCharArray()){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        int v=mp.getOrDefault('a',0);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' && counta<=v){
                counta++;
                if(counta==v){
                    return true;
                }
            }
            else{
                return false;
            }
        }
        return true;
    }
}