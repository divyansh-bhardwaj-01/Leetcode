class Solution {
    public boolean stoneGame(int[] piles) {
        int ansA=0;
        int ansB=Integer.MAX_VALUE;
        for(int i=0;i<piles.length;i++){
           for(int j=i;j<piles.length;j++){
             ansA=Math.max(ansA,piles[i]);
             ansB=Math.min(ansB,piles[i]);
           }
        }
        if(ansA>ansB){
            return true;
        }
        return false;
    }
}