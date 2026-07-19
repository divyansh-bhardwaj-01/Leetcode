class Solution {
    public int trailingZeroes(int n) {
        int num=0;
        for(int i=5;i<=n;i=i*5){
            if(i<=n){
                num=num+n/i;
            }
        }
        return num;
    }
}