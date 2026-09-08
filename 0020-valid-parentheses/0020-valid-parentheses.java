class Solution {
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                st.add(ch);
            }
            else if(!st.empty()){
                if(!st.empty() && st.peek()=='[' && ch==']') st.pop();
                else if(!st.empty() && st.peek()=='{' && ch=='}') st.pop();
                else if(!st.empty() && st.peek()=='(' && ch==')') st.pop();
                else return false;
                
            }
            else{
                st.add(ch);
            }

        }
        if(!st.empty()) return false;
        return true;
    }
}