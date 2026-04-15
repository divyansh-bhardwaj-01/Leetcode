class Solution {
    public int sumBase(int n, int k) {
       int power=1;
        int convert=0;
      while(n!=0){
        int digit=n%k;
        convert=convert+digit*power;
        power=power*10;
        n=n/k;
      }  
      int sum=0;
      while(convert!=0){
        int digit=convert%10;
        sum=sum+digit;
        convert=convert/10;
      }
      return sum;  
    }
}