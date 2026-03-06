class Solution {
    public boolean checkOnesSegment(String s) {
        StringBuilder str=new StringBuilder(s);
         int count1=0;
        int count0=0;
        
        for(int i=0;i<str.length();i++){
           if(str.charAt(i)=='1'){
            count1++;
           }
           else{
            count0++;
           }
           if(count0>=1 && str.charAt(i)=='1'){
            return false;
           }

        }
        return true;
    }
}