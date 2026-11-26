class Solution {
    public boolean canAliceWin(int n) {
        int num=10;
        int temp=n;
        for(int i=1;i<=temp;i++){
            if(n>=num){
                n=n-num;
                num--;
            }
            else{  
               if(n<num){
                if(i%2==0) return true;
                else return false;
               }
            }

            if(n==0){
                    if(i%2==0) return false;
                    else return true;
                }

        }
        return true;
    }
}