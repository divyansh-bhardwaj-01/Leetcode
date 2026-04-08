class Solution {
    public int arrangeCoins(int n) {
        int count=0;
        int num=0;
        int temp=n;
        for(int i=1;i<=n;i++){
           num=(temp-i);
           temp=temp-i; 
           if(num<0){
            break;
           }
           else{
            count++;
           }
        }
        return count;
    }
}