class Solution {
    public boolean checkDivisibility(int n) {
           int temp=n;
       int digit;
       int sum=0;
       int mult=1;
       while(n!=0){
        digit=n%10;
        sum=sum+digit;
        mult=mult*digit;
        n=n/10;
       } 
        
       int divisible=sum+mult;
       if(temp%divisible==0){
        return true;
       }
       else{
        return false;
       }
    }
}