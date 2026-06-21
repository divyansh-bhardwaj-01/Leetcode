class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int count=0;
        Arrays.sort(costs);
        long sum=0;
        for(int i=0;i<costs.length;i++){
            sum=sum+costs[i];
            if(sum<=coins){
                count++;
            }
        }
        return count;
    }
}