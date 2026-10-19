class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer>st=new Stack<>();
        int arr[]=new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            while(!st.empty() && temperatures[i]>temperatures[st.peek()]){
                int pre=st.pop();
                arr[pre]=i-pre;
            }
            st.push(i);
        }
        return arr;
    }
}