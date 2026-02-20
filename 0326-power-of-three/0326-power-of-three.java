class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0){
            return false;
        }
        int power=3;
        for(int i=0;i<Math.sqrt(n)+1;i++){
            if(n==Math.pow(power,i)){
                return true;
            }
        }
        return false;
    }
}