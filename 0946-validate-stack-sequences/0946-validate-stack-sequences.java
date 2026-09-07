class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer>st=new Stack<>();
        int idx=0;
        for(int i=0;i<pushed.length;i++){
            st.push(pushed[i]);
            while(!st.empty()){
                if(!st.empty() && st.peek()==popped[idx]){
                   st.pop();idx++;
                }
                else{
                    break;
                }
            }
         }
        
        while(!st.empty()){
            if(st.peek()==popped[idx]){
                st.pop();
                idx++;
            }
            else{
                return false;
            }
        }
        if(idx==popped.length) return true;
        return false;
    }
}