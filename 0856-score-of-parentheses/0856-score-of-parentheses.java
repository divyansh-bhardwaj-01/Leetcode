class Solution {
    public int scoreOfParentheses(String s) {
        int ans=0;
        int depth=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                depth++;
            }
            else{
                depth--;
                if(s.charAt(i-1)=='('){
                ans=ans+(int)Math.pow(2,depth);}
            }
        }
        return ans;
    }
}