class Solution {
    public int smallestRepunitDivByK(int k) {
      if(k%2==0 || k%5==0){
            return -1;
        }
        int count=1;
         long power=1;
         long n=k;
        for(int i=1;i<=k;i++){
            if(power%k==0){
                return count;
            }
                power = (power * 10 + 1)%k ;
            count++;
        }
        return -1;  
    }
}