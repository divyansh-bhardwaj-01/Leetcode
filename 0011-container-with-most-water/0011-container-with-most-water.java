class Solution {
    public int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;
        int st=0;
        int end=height.length-1;
         while(st<end){
            int wt=end-st;
            int ht=Math.min(height[st],height[end]);
            
            if(ht*wt>max){
                max=ht*wt;
            }
            if(height[st]>height[end]){
                end--;
            }
            else{
                st++;
            }
         }
        return max;
    }
}