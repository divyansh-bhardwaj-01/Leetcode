class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int sum=0;
        int count=0;
        for(int i=cost.length-1;i>=0;i--){ 
            sum=sum+cost[i];
            count++;
            if(count==2){
                i=i-1;
                count=0;
            }
        }
        return sum;
    }
}