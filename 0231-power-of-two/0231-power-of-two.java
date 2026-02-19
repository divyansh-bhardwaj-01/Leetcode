class Solution {
    public boolean isPowerOfTwo(int n) {
        long power=2;
        if(n<=0){
            return false;
        }
        for(int i=0;i<=Math.sqrt(n)+1;i++){
            if(n==Math.pow(power,i)){
                return true;
            }
        }
        return false;
    }
}