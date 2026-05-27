class Solution {
    public boolean checkPowersOfThree(int n) {
        while(n!=0){
            int digit=n%3;
            if(digit==2){
                return false;
            }
            n=n/3;
        }
        
        return true;
    }
}