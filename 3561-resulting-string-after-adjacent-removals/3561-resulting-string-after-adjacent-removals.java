class Solution {
    public String resultingString(String s) {
        Stack<Character>st=new Stack<>();
        st.add(s.charAt(0));
        for(int i=1;i<s.length();i++){
            char ch=s.charAt(i);
            int count=0;
            if(!st.empty() && st.peek()=='a' && (ch=='z' || ch=='b')){
                st.pop();
                count++;
            }
            else if( !st.empty() && st.peek()=='z' && (ch=='a' || ch=='y')){
                st.pop();
                count++;
            }
            else if(!st.empty() && (st.peek()!='a' && st.peek()!='z')  && (st.peek()+1==ch || st.peek()-1==ch)){
                st.pop();
                count++;
            }
            if(count==0){
                st.add(ch);
            }
        }
       StringBuilder sb=new StringBuilder();
       for(char i:st){
         sb.append(i);
       }
       return sb.toString();
    }
}