class Solution {
    public boolean isHappy(int n) {
        
        while(n!=1){
             int sum=0;
            String str=String.valueOf(n);
            for(int i=0;i<str.length();i++){
                int digit=str.charAt(i)-'0';
                sum=sum+(digit*digit);
            }
            n=sum;
              if(n==4){
            return false;
        }  
        }
       
        return true;
    }
}