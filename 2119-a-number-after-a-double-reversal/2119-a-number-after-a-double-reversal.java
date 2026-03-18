class Solution {
    public boolean isSameAfterReversals(int num) {
        int original=num;
        int reverse=0;
        while(num!=0){
          int digit=num%10;
          reverse=reverse*10+digit;
          num=num/10;
        }
        int temp=reverse;
        int againr=0;
        while(temp!=0){
            int digit=temp%10;
            againr=againr*10+digit;
            temp=temp/10;
        }
        if(againr==original){
            return true;
        }
        return false;
    }
}