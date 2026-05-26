class Solution {
    public int maxDistinct(String s) {
       Set<Character>st=new HashSet<>();
       for(char i:s.toCharArray()){
        st.add(i);
       } 
       return st.size();
    }
}