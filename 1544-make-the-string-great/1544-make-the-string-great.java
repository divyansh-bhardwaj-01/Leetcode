class Solution {
    public String makeGood(String s) {
        Stack<Character>st=new Stack<>();
        st.add(s.charAt(0));
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<s.length();i++){
            if(!st.empty() && st.peek()==s.charAt(i)+32){
            st.pop();
            } 
          else if(!st.empty() && st.peek()==s.charAt(i)-32){
            st.pop();
          }
          else{
            st.add(s.charAt(i));
          }
          
        }
        for(char i:st){
            sb.append(i);
        }
        return sb.toString();
    }
}