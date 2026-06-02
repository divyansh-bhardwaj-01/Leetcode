class Solution {
    public long getDescentPeriods(int[] prices) {
        long count=0;
        long ans=0;
        if(prices.length==1){
            return 1;
        }
        for(int i=1;i<prices.length;i++){
            if(prices[i-1]==prices[i]+1){
                count++;
                ans=ans+count;
            }
            else{
                count=0;
            }
        }
        return ans+prices.length;
    }
}