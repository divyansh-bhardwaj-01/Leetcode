class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Character>st1=new Stack<>();
        Stack<Integer>st2=new Stack<>();
        for(char ch:s.toCharArray()){
            if(!st1.empty() && st1.peek()==ch){
                st2.push(st2.pop()+1);
                if(st2.peek()>=k){
                    st1.pop();
                    st2.pop();
                }
            }
            else{
                st1.push(ch);
                st2.push(1);
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!st1.empty()){
            char ch=st1.pop();
            int count=st2.pop();
            for(int i=0;i<count;i++){
                sb.append(ch);
            }
        }
return sb.reverse().toString();
    }
}