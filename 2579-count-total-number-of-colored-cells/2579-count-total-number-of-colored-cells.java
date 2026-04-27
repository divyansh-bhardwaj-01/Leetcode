class Solution {
    public long coloredCells(int n) {
        long ans=1;
        long pow=4;
        for(int i=2;i<=n;i++){
            ans=ans+pow;
            pow=pow+4;
        }
        return ans;
    }
}