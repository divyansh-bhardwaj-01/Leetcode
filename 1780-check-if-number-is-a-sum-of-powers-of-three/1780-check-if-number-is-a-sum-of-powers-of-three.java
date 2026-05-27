class Solution {
    public boolean checkPowersOfThree(int n) {
        StringBuilder sb=new StringBuilder();
        while(n!=0){
            int digit=n%3;
             sb.append(digit);
            n=n/3;
        }
         String str=sb.reverse().toString();
         for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='2'){
                return false;
            }
         }
         return true;
    }
}