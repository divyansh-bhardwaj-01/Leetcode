class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String>ans=new ArrayList<>();
        Stack<Integer>st=new Stack<>();
        if(target.length==1){ ans.add("Push");
        return ans;}
        int j=0;
        for(int i=1;i<=n;i++){
            st.push(i);
            ans.add("Push");
            if(j<target.length && st.peek()==target[j]){
                j++;
            }
            else{
                st.pop();
                ans.add("Pop");
            }
            if(j==target.length) break;
        }
        return ans;
    }
}