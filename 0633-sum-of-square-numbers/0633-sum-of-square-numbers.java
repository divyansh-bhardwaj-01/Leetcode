class Solution {
    public boolean judgeSquareSum(int c) {
         long st=0;
         long end=(long) Math.sqrt(c);
        while(st<=end){
             long sum=(st*st)+(end*end);
            if(sum==c){
                return true;
            }
            if(sum<c){
                st++;
            }
            else{
                end--;
            }
        }
        return false;

    }
}