class Solution {
    public int maxBalancedShipments(int[] weight) {
        int count=0;
        Stack<Integer>st=new Stack<>();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<weight.length;i++){
            max=Math.max(max,weight[i]);
            st.add(weight[i]);
            if(max>st.peek()){
                count++;
                max=-1;
                st.clear();
            }
             
        }
        return count;
    }
}