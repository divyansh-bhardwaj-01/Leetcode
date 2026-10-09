class Solution {
    public int longestContinuousSubstring(String s) {
        if(s.length()==1) return 1;
        Stack<Character>st=new Stack();
        st.add(s.charAt(0));
        int left=0;
        int max=0;
        for(int i=1;i<s.length();i++){
            char ch=s.charAt(i);
            if(!st.empty() && ch==st.peek()+1){
                st.add(ch);
            }
            else{
                st.clear();
                st.add(ch);
                left=i;
            }
            max=Math.max(max,i-left+1);

        }
        return max;
    }
}