class Solution {
    public boolean sumOfNumberAndReverse(int num) {
         for(int i=0;i<=num;i++){
            int reverse=0;
            int a=i;
            while(a>0){
                int digit=a%10;
                reverse=reverse*10+digit;
                a=a/10;
            }  
            if(i+reverse==num){
                return true;
            }
        }
        return false;
    }
}