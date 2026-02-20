class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0){
            return false;
        }
        long power=1;
        for(int i=0;power<=n;i++){
            if(power==n){
                return true;
            }
            power=power*3;
        }
        return false;
    }
}