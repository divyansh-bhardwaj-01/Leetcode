class Solution {
    public int smallestEvenMultiple(int n) {
         int duplii=0;
       for(int i=n;i<=(n*2);i++){
        if(i%n==0 && i%2==0){
            duplii=i;
            return i;

        }
         
       }
       return duplii;
    }
}