class Solution {
    public boolean halvesAreAlike(String s) {
        String str=s.toLowerCase();
        int countA=0;
        int countB=0;
        for(int i=0;i<str.length()/2;i++){
           if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' ||str.charAt(i)=='u'    ){
            countA++;
           } 
        }
        for(int i=str.length()/2;i<str.length();i++){
           if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' ||str.charAt(i)=='u'    ){
            countB++;
           } 
        }
        if(countA==countB){
            return true;
        }
        return false;
    }
}