class Solution {
    public int numberOfSpecialChars(String word) {
      Set<Character>st=new HashSet<>();
      for(char i:word.toCharArray()){
        st.add(i);
      }  
      String str="";
      for(char ch:st){
        str=ch+str;
      }
      str=str.toLowerCase();
      HashMap<Character,Integer>mp=new HashMap<>();
      for(char i:str.toCharArray()){
        mp.put(i,mp.getOrDefault(i,0)+1);
      }
      int count=0;
      for(Integer value:mp.values()){
        if(value==2){
         count++;
        }
      }
      return count;
    }
}