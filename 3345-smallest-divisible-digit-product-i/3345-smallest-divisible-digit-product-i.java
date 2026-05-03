class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=1;i<=100;i++){
            int num=i;
            int fact=1;
            while(num!=0){
                int digit=num%10;
                fact=fact*digit;
                num=num/10;
            }
            if( i>=n && fact%t==0){
                return i;
            }
        }
        return -1;
    }
}