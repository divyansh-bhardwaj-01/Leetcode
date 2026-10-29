class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int total=0;
        for(int i=0;i<cardPoints.length;i++){
            total=total+cardPoints[i];
        }
        int sum=0;
        int min=Integer.MAX_VALUE;
        int left=0;
        int len=cardPoints.length-k;
        for(int i=0;i<cardPoints.length;i++){
            sum=sum+cardPoints[i];
            while(i-left+1>len){
                sum=sum-cardPoints[left];
                left++;
            }
            if(i-left+1==len)
            min=Math.min(min,sum);
        }
        return total-min;

    }
}