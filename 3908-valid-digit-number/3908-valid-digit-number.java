class Solution {
    public boolean validDigit(int n, int x) {
        String str=String.valueOf(n);
        for(int i=0;i<str.length();i++){
             if(str.charAt(i)-'0'==x && i==0){
                return false;
             }
            if(str.charAt(i)-'0'==x){
                return true;
            }
        }
        return false;
    }
}